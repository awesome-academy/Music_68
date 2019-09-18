package vn.sun.music_68.ui.genres;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import vn.sun.music_68.R;
import vn.sun.music_68.base.BaseActivity;
import vn.sun.music_68.data.model.Genres;
import vn.sun.music_68.data.model.Track;
import vn.sun.music_68.data.repository.TrackRepository;
import vn.sun.music_68.data.source.local.TrackLocalDataSource;
import vn.sun.music_68.data.source.remote.TrackRemoteDataSource;
import vn.sun.music_68.ui.adapter.TrackAdapter;
import vn.sun.music_68.utils.Constants;
import vn.sun.music_68.utils.StringUtils;

public class GenresActivity extends BaseActivity implements GenresContract.View {
    private TrackAdapter mTrackAdapter;
    private RecyclerView mRecyclerTracks;
    private TextView mTextGenreName;
    private ImageView mGenreImage;
    private List<Track> mTracks;
    private GenresContract.Presenter mPresenter;
    private String mGenreKey;
    private String mGenreApi;
    private int mOffset;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.item_genres_detail;
    }


    @Override
    protected void initViews(Bundle savedInstanceState) {
        mRecyclerTracks = findViewById(R.id.recycler_music);
        mTextGenreName = findViewById(R.id.text_name_genres);
        mGenreImage = findViewById(R.id.image_artwork);
        initData();
        mTrackAdapter = new TrackAdapter(this, mTracks);
        mRecyclerTracks.setAdapter(mTrackAdapter);
    }

    private void initData() {
        mOffset = 0;
        mTracks = new ArrayList<>();
        TrackRepository repository = TrackRepository.getInstance(TrackRemoteDataSource.getInstance(),
                TrackLocalDataSource.getInstance(this));
        mPresenter = new GenresPresenter(repository, this);
        Intent intent = getIntent();
        Genres genres = intent.getParcelableExtra(Constants.EXTRA_GENRES);
        mGenreKey = genres.getKey();
        mGenreApi = StringUtils.initGenreUrl(mGenreKey, mOffset);
        mTextGenreName.setText(genres.getName());
        Glide.with(this).load(genres.getPhoto()).centerCrop().into(mGenreImage);
        mPresenter.getTrack(mGenreApi);
    }

    public static Intent getIntent(Context context, Genres genre) {
        Intent intent = new Intent(context, GenresActivity.class);
        intent.putExtra(Constants.EXTRA_GENRES, genre);
        return intent;
    }

    @Override
    public void onShowTrack(List<Track> tracks) {
        mTrackAdapter.addTrack(tracks);
    }

    @Override
    public void onLoadFail(String message) {
    }
}

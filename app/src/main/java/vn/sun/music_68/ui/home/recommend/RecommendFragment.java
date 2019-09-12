package vn.sun.music_68.ui.home.recommend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import vn.sun.music_68.R;
import vn.sun.music_68.base.BaseFragment;
import vn.sun.music_68.data.model.GenreKey;
import vn.sun.music_68.data.model.GenreName;
import vn.sun.music_68.data.model.Genres;
import vn.sun.music_68.data.model.Track;
import vn.sun.music_68.data.repository.TrackRepository;
import vn.sun.music_68.data.source.local.TrackLocalDataSource;
import vn.sun.music_68.data.source.remote.TrackRemoteDataSource;
import vn.sun.music_68.ui.genres.GenresActivity;
import vn.sun.music_68.ui.home.adapter.GenreAdapter;
import vn.sun.music_68.ui.home.adapter.NewReleaseAdapter;
import vn.sun.music_68.utils.Constants;
import vn.sun.music_68.utils.StringUtils;

public class RecommendFragment extends BaseFragment implements GenreAdapter.GenreClickListener,
        RecommendContract.View {
    private NewReleaseAdapter newReleaseAdapter;
    private RecyclerView mRecyclerGenres;
    private RecyclerView mRecyclerNewRelease;
    private List<Genres> mGenres;
    private List<Track> mTracks;
    private String mGenreApi;
    private RecommendContract.Presenter mPresenter;

    public RecommendFragment() {

    }

    public static RecommendFragment newInstance() {
        return new RecommendFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        initData();
        initRecycler(view);

        GenreAdapter genreAdapter = new GenreAdapter(getContext(), this, mGenres);
        mRecyclerGenres.setAdapter(genreAdapter);
        newReleaseAdapter = new NewReleaseAdapter(getContext(), mTracks);
        mRecyclerNewRelease.setAdapter(newReleaseAdapter);
    }

    private void initRecycler(View view) {
        mRecyclerNewRelease = view.findViewById(R.id.recycler_music);
        mRecyclerGenres = view.findViewById(R.id.recycler_genres);
    }


    private void initData() {
        mGenres = new ArrayList<>();
        mGenres.add(new Genres(GenreKey.ALL_AUDIO, GenreName.ALL_AUDIO,
                R.drawable.genres_all_audio));
        mGenres.add(new Genres(GenreKey.ALL_MUSIC, GenreName.ALL_MUSIC,
                R.drawable.genres_all_music));
        mGenres.add(new Genres(GenreKey.ROCK, GenreName.ROCK,
                R.drawable.genres_alternativerock));
        mGenres.add(new Genres(GenreKey.AMBIENT, GenreName.AMBIENT,
                R.drawable.genres_ambient));
        mGenres.add(new Genres(GenreKey.CLASSICAL, GenreName.CLASSICAL,
                R.drawable.genres_classical));
        mGenres.add(new Genres(GenreKey.COUNTRY, GenreName.COUNTRY,
                R.drawable.genres_country));
        initPresenter();
    }

    private void initPresenter() {
        TrackRepository repository = TrackRepository.getInstance(TrackRemoteDataSource.getInstance(),
                TrackLocalDataSource.getInstance(getContext())
        );
        mPresenter = new RecommendPresenter(this, repository);
        mGenreApi = StringUtils.initGenreUrl(GenreKey.ALL_MUSIC, 0);
        mPresenter.getTrack(mGenreApi);
    }

    @Override
    public void onShowTrack(List<Track> track) {
        newReleaseAdapter.addTrack(track);
    }

    @Override
    public void onItemClickListener(Genres genres) {
        Intent intent = GenresActivity.getIntent(getActivity());
        intent.putExtra(Constants.EXTRA_GENRES, genres);
        startActivity(intent);
        Toast.makeText(getActivity(), genres.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoadFail(String message) {

    }
}

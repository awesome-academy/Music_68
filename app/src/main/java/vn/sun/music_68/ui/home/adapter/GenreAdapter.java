package vn.sun.music_68.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import vn.sun.music_68.R;
import vn.sun.music_68.base.BaseRecyclerViewAdapter;
import vn.sun.music_68.data.model.Genres;
import vn.sun.music_68.data.model.Track;

public class GenreAdapter extends BaseRecyclerViewAdapter<Track, GenreAdapter.ViewHolder> {
    private GenreClickListener mListener;
    private LayoutInflater mLayoutInflater;
    private List<Genres> mGenres;

    public GenreAdapter(Context context, GenreClickListener listener, List<Genres> genres) {
        mLayoutInflater = LayoutInflater.from(context);
        mListener = listener;
        mGenres = genres;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.item_genres, parent, false);
        return new ViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.bindData(mGenres.get(position));
    }

    @Override
    public int getItemCount() {
        return (mGenres != null) ? mGenres.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView mGenreImage;
        private TextView mGenreName;
        private GenreClickListener mListener;
        private Genres mGenres;

        private ViewHolder(@NonNull View itemView, GenreClickListener listener) {
            super(itemView);
            mListener = listener;
            itemView.setOnClickListener(this);
            initView();
        }

        private void initView() {
            mGenreImage = itemView.findViewById(R.id.image_artwork);
            mGenreName = itemView.findViewById(R.id.text_artist);
        }

        @Override
        public void onClick(View v) {
            mListener.onItemClickListener(mGenres);
        }

        private void bindData(Genres genres) {
            Glide.with(itemView.getContext())
                    .load(genres.getPhoto())
                    .centerCrop()
                    .placeholder(R.drawable.genres_all_audio)
                    .into(mGenreImage);
            mGenreName.setText(genres.getName());
            mGenres = genres;
        }
    }

    public interface GenreClickListener {
        void onItemClickListener(Genres genres);
    }
}

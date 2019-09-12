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
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

import vn.sun.music_68.R;
import vn.sun.music_68.base.BaseRecyclerViewAdapter;
import vn.sun.music_68.data.model.Track;

public class NewReleaseAdapter extends BaseRecyclerViewAdapter<Track, NewReleaseAdapter.ViewHolder> {
    private List<Track> mTracks;
    private LayoutInflater mLayoutInflater;
    private TrackRealesListener mListener;

    public NewReleaseAdapter(Context context, List<Track> tracks) {
        mTracks = new ArrayList<>();
        mLayoutInflater = LayoutInflater.from(context);
    }

    public void addTrack(List<Track> tracks) {
        if (tracks != null) {
            mTracks.clear();
            mTracks.addAll(tracks);
            notifyDataSetChanged();
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.item_new_release, parent, false);
        return new ViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(mTracks.get(position));
    }

    @Override
    public int getItemCount() {
        return (mTracks != null) ? mTracks.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView mTrackImage;
        private TextView mTextArtistName;
        private TextView mTextTrackName;

        private ViewHolder(@NonNull View itemView, TrackRealesListener listener) {
            super(itemView);
            mTrackImage = itemView.findViewById(R.id.image_artwork);
            mTextArtistName = itemView.findViewById(R.id.text_artist);
            mTextTrackName = itemView.findViewById(R.id.text_song_name);
        }

        private void bindData(Track track) {
            Glide.with(itemView.getContext())
                    .load(track.getArtworkUrl())
                    .apply(RequestOptions.circleCropTransform())
                    .into(mTrackImage);
            mTextArtistName.setText(track.getArtist());
            mTextTrackName.setText(track.getTitle());
        }

        @Override
        public void onClick(View v) {

        }
    }

    public interface TrackRealesListener {
        void onItemClickListener(int position);
    }
}

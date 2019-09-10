package vn.sun.music_68.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.sun.music_68.R;
import vn.sun.music_68.base.BaseRecyclerViewAdapter;
import vn.sun.music_68.data.model.Track;

public class TrackAdapter extends BaseRecyclerViewAdapter<Track, TrackAdapter.ViewHolder> {
    private List<Track> mTracks;
    private LayoutInflater mLayoutInflater;
    private TrackClickListener mListener;

    public TrackAdapter(Context context, List<Track> tracks) {
        mLayoutInflater = LayoutInflater.from(context);
        mTracks = tracks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.item_playing_list, parent, false);
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

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView, TrackClickListener listener) {
            super(itemView);
        }

        public void bindData(Track track) {

        }
    }

    public interface TrackClickListener {
        void onItemClickListener(int position);
    }
}

package vn.sun.music_68.base;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRecyclerViewAdapter<T, VH extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<VH> {
    protected List<T> mData;
    protected ItemListener<T> mListener;

    public BaseRecyclerViewAdapter() {
        mData = new ArrayList<>();
    }

    public void setItemListener(ItemListener<T> listener) {
        if (listener != null) {
            mListener = listener;
        }
    }

    public void setData(List<T> data) {
        if (data != null) {
            mData.clear();
            mData.addAll(data);
            notifyDataSetChanged();
        }
    }

    public List<T> getData() {
        return mData;
    }

    public void addItem(T t) {
        mData.add(t);
        notifyItemInserted(mData.size() - 1);
    }

    public void removeItem(int position) {
        mData.remove(position);
        notifyItemRemoved(position);
    }

    public interface ItemListener<T> {
        void onItemClickListener(T t, int position);
    }
}

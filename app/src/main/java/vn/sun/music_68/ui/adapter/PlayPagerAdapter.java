package vn.sun.music_68.ui.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PlayPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private List<Fragment> mFragments = new ArrayList<>();

    public PlayPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    public void submitData(List<Fragment> fragments) {
        this.mFragments = fragments;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}

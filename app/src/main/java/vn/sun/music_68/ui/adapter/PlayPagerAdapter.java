package vn.sun.music_68.ui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PlayPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragments = new ArrayList<>();

    public PlayPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void submitData(List<Fragment> fragments) {
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return (mFragments != null) ? mFragments.size() : 0;
    }
}

package vn.sun.music_68.ui.home.adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import vn.sun.music_68.R;
import vn.sun.music_68.utils.NavigationMode;

public class HomePagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private List<Fragment> mFragments = new ArrayList<>();

    public HomePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    public void submitData(List<Fragment> fragments) {
        this.mFragments = fragments;
        notifyDataSetChanged();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case NavigationMode.ZERO:
                return mContext.getString(R.string.title_my_music);
            case NavigationMode.ONE:
                return mContext.getString(R.string.title_recommend);
        }
        return null;
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }
}

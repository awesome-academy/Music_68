package vn.sun.music_68.ui.nowplaying;

import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import vn.sun.music_68.R;
import vn.sun.music_68.base.BaseActivity;
import vn.sun.music_68.ui.adapter.PlayPagerAdapter;

public class NowPlayingActivity extends BaseActivity {
    private View mView;
    private ViewPager mViewPager;
    private List<Fragment> mFragments;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_now_playing;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        mView = findViewById(R.id.view_bottom);
        mViewPager = findViewById(R.id.view_pager);
        mFragments = new ArrayList<>();
        mFragments.add(FragmentMainPlaying.getInstance());
        mFragments.add(FragmentPlayingList.getInstance());
        PlayPagerAdapter adapter = new PlayPagerAdapter( getSupportFragmentManager());
        adapter.submitData(mFragments);
        mViewPager.setAdapter(adapter);
    }
}

package vn.sun.music_68.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import vn.sun.music_68.R;
import vn.sun.music_68.base.BaseActivity;
import vn.sun.music_68.ui.home.adapter.HomePagerAdapter;
import vn.sun.music_68.ui.home.mymusic.MyMusicFragment;
import vn.sun.music_68.ui.home.recommend.RecommendFragment;

public class MainActivity extends BaseActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<Fragment> mFragments;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);
        mFragments = new ArrayList<>();
        mFragments.add(MyMusicFragment.getInstance());
        mFragments.add(RecommendFragment.newInstance());
        HomePagerAdapter adapter = new HomePagerAdapter(this, getSupportFragmentManager());
        adapter.submitData(mFragments);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    public static Intent getIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }
}

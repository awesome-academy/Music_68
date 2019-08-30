package vn.sun.music_68.ui.home.recommend;

import android.os.Bundle;
import android.view.View;

import vn.sun.music_68.R;
import vn.sun.music_68.base.BaseFragment;

public class RecommendFragment extends BaseFragment {

    public RecommendFragment() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }
    public static RecommendFragment getInstance(){
        RecommendFragment recommendFragment = new RecommendFragment();
        return recommendFragment;
    }
}

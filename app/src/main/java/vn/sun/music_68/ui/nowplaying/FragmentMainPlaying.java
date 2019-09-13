package vn.sun.music_68.ui.nowplaying;

import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;

import vn.sun.music_68.R;
import vn.sun.music_68.base.BaseFragment;

public class FragmentMainPlaying extends BaseFragment {


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main_playing;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    public static Fragment getInstance() {
        FragmentMainPlaying fragmentMainPlaying = new FragmentMainPlaying();
        return fragmentMainPlaying;
    }
}

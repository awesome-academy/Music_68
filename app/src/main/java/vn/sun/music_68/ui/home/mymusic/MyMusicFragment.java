package vn.sun.music_68.ui.home.mymusic;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import vn.sun.music_68.R;

public class MyMusicFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_music, container, false);
    }

    public static MyMusicFragment getInstance(){
        MyMusicFragment myMusicFragment = new MyMusicFragment();
        return myMusicFragment;
    }
}

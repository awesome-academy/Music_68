package vn.sun.music_68.ui.home.recommend;

import java.util.List;

import vn.sun.music_68.data.model.Track;

public class RecommendContract {
    interface View {
        void onShowTrack(List<Track> track);

        void onLoadFail(String message);
    }

    interface Presenter {
        void getTrack(String api);
    }
}

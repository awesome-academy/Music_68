package vn.sun.music_68.ui.genres;

import java.util.List;

import vn.sun.music_68.data.model.Track;

public class GenresContract {
    interface View {
        void onLoadSuccess(List<Track> tracks);

        void onLoadFail(String message);
    }

    interface Presenter {
        void getTrack(String api);
    }
}

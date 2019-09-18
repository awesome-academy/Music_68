package vn.sun.music_68.mediaplayer;

public interface OnLoadingTrackListener {
    void onStartLoading(int index);

    void onLoadingFail(String message);

    void onLoadingSuccess();

    void onTrackPaused();

    void onTrackStopped();
}

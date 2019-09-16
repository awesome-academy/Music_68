package vn.sun.music_68.service;

public interface MediaPlayerController {
    void create(int index);

    void prepareAsync();

    void start();

    void pause();

    void stop();

    int getDuration();

    int getCurrentPosition();

    boolean isPlaying();

    void seek(int position);

    void loop(boolean isLoop);

    int getCurrentPositionSong();

    void changeSong(int i);
}

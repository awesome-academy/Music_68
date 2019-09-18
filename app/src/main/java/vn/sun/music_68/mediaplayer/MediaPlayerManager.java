package vn.sun.music_68.mediaplayer;

import android.media.MediaPlayer;

import vn.sun.music_68.service.MediaPlayerController;

public class MediaPlayerManager extends MediaPlayerSetting implements MediaPlayerController,
        MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {

    @Override
    public void onCompletion(MediaPlayer mp) {

    }

    @Override
    public void onPrepared(MediaPlayer mp) {

    }

    @Override
    public void create(int index) {

    }

    @Override
    public void prepareAsync() {

    }

    @Override
    public void start() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public int getCurrentPosition() {
        return 0;
    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public void seek(int position) {

    }

    @Override
    public void loop(boolean isLoop) {

    }

    @Override
    public int getCurrentPositionSong() {
        return 0;
    }

    @Override
    public void changeSong(int i) {

    }
}

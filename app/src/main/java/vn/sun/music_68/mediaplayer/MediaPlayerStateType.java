package vn.sun.music_68.mediaplayer;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({MediaPlayerStateType.IDLE,
        MediaPlayerStateType.INITIALIZED,
        MediaPlayerStateType.PREPARING,
        MediaPlayerStateType.STARTED,
        MediaPlayerStateType.PAUSED,
        MediaPlayerStateType.STOPPED,
        MediaPlayerStateType.END,
        MediaPlayerStateType.PLAYBACK_COMPLETED,
})

public @interface MediaPlayerStateType {
    int IDLE = 0;
    int INITIALIZED = 1;
    int PREPARING = 2;
    int STARTED = 3;
    int PAUSED = 4;
    int STOPPED = 5;
    int END = 6;
    int PLAYBACK_COMPLETED = 7;
}

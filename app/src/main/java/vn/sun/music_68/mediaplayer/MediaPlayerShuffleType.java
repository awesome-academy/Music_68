package vn.sun.music_68.mediaplayer;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({MediaPlayerShuffleType.OFF,
        MediaPlayerShuffleType.ON})

public @interface MediaPlayerShuffleType {
    int OFF = 0;
    int ON = 1;
}

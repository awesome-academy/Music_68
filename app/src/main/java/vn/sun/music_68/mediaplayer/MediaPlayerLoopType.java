package vn.sun.music_68.mediaplayer;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({MediaPlayerLoopType.NONE,
        MediaPlayerLoopType.ONE,
        MediaPlayerLoopType.ALL})
public @interface MediaPlayerLoopType {
    int NONE = 0;
    int ONE = 1;
    int ALL = 2;
}

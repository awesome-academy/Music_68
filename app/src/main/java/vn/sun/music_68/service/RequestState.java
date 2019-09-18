package vn.sun.music_68.service;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({RequestState.WHAT_CREATE,
        RequestState.WHAT_CHANGE_SONG,
        RequestState.WHAT_REQUEST_START,
        RequestState.WHAT_REQUEST_PAUSE,
        RequestState.WHAT_REQUEST_SEEK,
        RequestState.WHAT_REQUEST_PREPARE_ASYNC,
})

public @interface RequestState {
    int WHAT_CREATE = 1;
    int WHAT_CHANGE_SONG = 2;
    int WHAT_REQUEST_START = 3;
    int WHAT_REQUEST_PAUSE = 4;
    int WHAT_REQUEST_SEEK = 5;
    int WHAT_REQUEST_PREPARE_ASYNC = 6;
}

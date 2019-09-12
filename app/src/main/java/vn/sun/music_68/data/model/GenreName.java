package vn.sun.music_68.data.model;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@StringDef({GenreName.ALL_MUSIC,
        GenreName.ALL_AUDIO,
        GenreName.ROCK,
        GenreName.AMBIENT,
        GenreName.CLASSICAL,
        GenreName.COUNTRY
})

@Retention(RetentionPolicy.SOURCE)

public @interface GenreName {
    String ALL_MUSIC = " All Music";
    String ALL_AUDIO = " All Audio";
    String ROCK = " Alternative Rock";
    String AMBIENT = " Ambient";
    String CLASSICAL = " Classical";
    String COUNTRY = " Country";
}

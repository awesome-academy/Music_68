package vn.sun.music_68.data.model;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@StringDef({GenreKey.ALL_MUSIC,
        GenreKey.ALL_AUDIO,
        GenreKey.ROCK,
        GenreKey.AMBIENT,
        GenreKey.CLASSICAL,
        GenreKey.COUNTRY
})
@Retention(RetentionPolicy.SOURCE)

public @interface GenreKey {
    String ALL_MUSIC = "soundcloud:genres:all-music";
    String ALL_AUDIO = "soundcloud:genres:all-audio";
    String ROCK = "soundcloud:genres:alternativerock";
    String AMBIENT = "soundcloud:genres:ambient";
    String CLASSICAL = "soundcloud:genres:classical";
    String COUNTRY = "soundcloud:genres:country";
}


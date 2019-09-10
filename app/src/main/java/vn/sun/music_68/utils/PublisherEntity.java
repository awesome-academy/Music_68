package vn.sun.music_68.utils;


import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@StringDef({PublisherEntity.ID, PublisherEntity.ARTIST})

@Retention(RetentionPolicy.SOURCE)
public @interface PublisherEntity {
    String ID = "id";
    String ARTIST = "artist";
}

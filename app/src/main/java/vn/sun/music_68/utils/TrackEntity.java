package vn.sun.music_68.utils;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@StringDef({TrackEntity.ARTWORK_URL,
        TrackEntity.DESCRIPTION,
        TrackEntity.DOWNLOADABLE,
        TrackEntity.DURATION,
        TrackEntity.GENRE,
        TrackEntity.ID,
        TrackEntity.TITLE,
        TrackEntity.PUBLISHER_METADATA,
        TrackEntity.STREAMABLE,
        TrackEntity.PLAYBACK_COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface TrackEntity {
    String ARTWORK_URL = "artwork_url";
    String DESCRIPTION = "description";
    String DOWNLOADABLE = "downloadable";
    String DURATION = "duration";
    String GENRE = "genre";
    String ID = "id";
    String TITLE = "title";
    String PUBLISHER_METADATA = "publisher_metadata";
    String STREAMABLE = "streamable";
    String PLAYBACK_COUNT = "playback_count";
}

package vn.sun.music_68.utils;

import java.util.concurrent.TimeUnit;

import vn.sun.music_68.data.model.GenreKey;

public class StringUtils {
    private static String append(String... strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static String initGenreUrl(@GenreKey String genreKey, int offset) {
        return StringUtils.append(API.BASE_GENRE_URL_TOP,
                genreKey,
                API.PARAMETER_ID, API.TestID,
                API.PARAMETER_LIMIT, String.valueOf(Constants.SONG_LIMIT),
                API.PARAMETER_OFFSET, String.valueOf(offset));
    }

    public static String buildUrl(String baseUrl, Object... args) {
        return String.format(baseUrl, args);
    }

    public static String convertTimeToString(long duration) {
        return String.format("%02d:%02d",
                TimeUnit.MILLISECONDS.toMinutes(duration) -
                        TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(duration)),
                TimeUnit.MILLISECONDS.toSeconds(duration) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
    }

    public static String initStreamApi(long trackId) {
        return StringUtils.append(API.BASE_URL_TRACK, API.SPLASH,
                String.valueOf(trackId), API.SPLASH,
                API.NAME_STREAM,
                API.PARAMETER_Q_ID, API.TestID);
    }
}

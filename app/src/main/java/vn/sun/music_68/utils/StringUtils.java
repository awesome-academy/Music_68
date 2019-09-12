package vn.sun.music_68.utils;

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
}

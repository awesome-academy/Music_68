package vn.sun.music_68.utils;

import vn.sun.music_68.BuildConfig;

public interface API {
    String API_ROOT = "https://api-v2.soundcloud.com";
    String BASE_GENRE_URL_TOP
            = "https://api-v2.soundcloud.com/charts?kind=top&genre=";
    String BASE_GENRE_URL_TRENDING
            = "https://api-v2.soundcloud.com/charts?kind=trending&genre=";
    String BASE_SEARCH_URL
            = "/tracks?q=%s&client_id=%s&limit=%d&offset=%d";
    String BASE_DOWNLOAD_URL
            = "/tracks/%d/download?client_id=%s";
    String BASE_STREAM_URL
            = "/tracks/%d/stream?client_id=%s";
    String BASE_URL_TRACK = "http://api.soundcloud.com/tracks";
    String PARAMETER_LIMIT = "&limit=";
    String PARAMETER_OFFSET = "&offset=";
    String PARAMETER_SEARCH = "&q=";
    String PARAMETER_Q_ID = "?client_id=";
    String PARAMETER_ID = "&client_id=";
    String TestID = BuildConfig.CLIENT_ID;
    String NAME_STREAM = "stream";
    String SPLASH = "/";
    String QUESTION_MARK = "?";
}

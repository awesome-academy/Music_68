package vn.sun.music_68.utils;

public interface API {
    String API_ROOT = "https://api-v2.soundcloud.com";
    String BASE_GENRE_URL
            = "/charts?kind=%s&genre=%s&client_id=%s&limit=%d&offset=%d";
    String BASE_SEARCH_URL
            = "/tracks?q=%s&client_id=%s&limit=%d&offset=%d";
    String BASE_DOWNLOAD_URL
            = "/tracks/%d/download?client_id=%s";
    String BASE_STREAM_URL
            = "/tracks/%d/stream?client_id=%s";

    String KIND_TOP = "top";
    String KIND_TREND = "trending";
    String GENRES_ALL_MUSIC = "soundcloud:genres:all-music";
    String GENRES_ALL_AUDIO = "soundcloud:genres:all-audio";
    String GENRES_ROCK = "soundcloud:genres:alternativerock";
    String GENRES_COUNTRY = "soundcloud:genres:country";
    String GENRES_CLASSICAL = "soundcloud:genres:country";
    String GENRES_AMBIENT = "soundcloud:genres:ambient";
}

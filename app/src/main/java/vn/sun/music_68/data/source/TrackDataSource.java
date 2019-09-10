package vn.sun.music_68.data.source;

import java.util.List;

import vn.sun.music_68.data.model.Track;

public interface TrackDataSource {
    interface DataCallback<T> {
        void onSuccess(List<T> datas);

        void onFailure(String message);
    }

    interface Local {
        void getLocalTrack(DataCallback<Track> callback);

        void getFavoriteTracks(DataCallback<Track> callback);

        void getRecentTrack(DataCallback<Track> callback);

        void addFavoriteTrack(Track track, DataCallback<Track> callback);

        void deleteFavoriteTrack(Track track, DataCallback<Track> callback);
    }

    interface Remote extends TrackDataSource {

        void getTracks(String api, DataCallback<Track> callback);

        void searchTracks(String api, DataCallback<Track> callback);

        void getDetailTrack(String api, DataCallback<Track> callback);
    }
}

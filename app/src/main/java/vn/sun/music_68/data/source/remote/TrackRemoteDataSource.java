package vn.sun.music_68.data.source.remote;

import vn.sun.music_68.data.model.Track;
import vn.sun.music_68.data.source.TrackDataSource;

public class TrackRemoteDataSource implements TrackDataSource.Remote {
    private static TrackRemoteDataSource sInstance;

    public static TrackRemoteDataSource getInstance() {
        if (sInstance == null) {
            synchronized (TrackRemoteDataSource.class) {
                if (sInstance == null) {
                    sInstance = new TrackRemoteDataSource();
                }
            }
        }
        return sInstance;
    }

    @Override
    public void getTracks(String api, DataCallback<Track> callback) {

    }

    @Override
    public void searchTracks(String api, DataCallback<Track> callback) {

    }

    @Override
    public void getDetailTrack(String api, DataCallback<Track> callback) {

    }
}

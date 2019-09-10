package vn.sun.music_68.data.repository;

import vn.sun.music_68.data.model.Track;
import vn.sun.music_68.data.source.TrackDataSource;

public class TrackRepository implements TrackDataSource.Local, TrackDataSource.Remote {
    private static TrackRepository sInstance;
    private TrackDataSource.Local mLocalDataSource;
    private TrackDataSource.Remote mRemoteDataSource;

    private TrackRepository() {
    }

    public static TrackRepository getInstance(TrackRepository.Remote remoteDataSource,
                                              TrackRepository.Local localDataSource) {
        if (sInstance == null) {
            synchronized (TrackRepository.class) {
                if (sInstance == null) {
                    sInstance = new TrackRepository(remoteDataSource,localDataSource);
                }
            }
        }
        return sInstance;
    }

    private TrackRepository(Remote remoteDataSource, Local localDataSource) {
        mLocalDataSource = localDataSource;
        mRemoteDataSource = remoteDataSource;
    }

    @Override
    public void getLocalTrack(DataCallback<Track> callback) {
        mLocalDataSource.getLocalTrack(callback);
    }

    @Override
    public void getFavoriteTracks(DataCallback<Track> callback) {
        mLocalDataSource.getFavoriteTracks(callback);
    }

    @Override
    public void getRecentTrack(DataCallback<Track> callback) {
        mLocalDataSource.getRecentTrack(callback);
    }

    @Override
    public void addFavoriteTrack(Track track, DataCallback<Track> callback) {
        mLocalDataSource.addFavoriteTrack(track, callback);
    }

    @Override
    public void deleteFavoriteTrack(Track track, DataCallback<Track> callback) {
        mLocalDataSource.deleteFavoriteTrack(track, callback);
    }

    @Override
    public void getTracks(String api, DataCallback<Track> callback) {
        mRemoteDataSource.getTracks(api, callback);
    }

    @Override
    public void searchTracks(String api, DataCallback<Track> callback) {
        mRemoteDataSource.searchTracks(api, callback);
    }

    @Override
    public void getDetailTrack(String api, DataCallback<Track> callback) {
        mRemoteDataSource.getDetailTrack(api, callback);
    }
}

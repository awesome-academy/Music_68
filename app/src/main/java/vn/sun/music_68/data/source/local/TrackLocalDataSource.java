package vn.sun.music_68.data.source.local;

import android.content.Context;

import vn.sun.music_68.data.model.Track;
import vn.sun.music_68.data.source.TrackDataSource;

public class TrackLocalDataSource implements TrackDataSource.Local {
    private static TrackLocalDataSource sInstance;

    private TrackLocalDataSource(Context context) {
    }

    public static TrackLocalDataSource getInstance(Context context) {

        if (sInstance == null) {
            synchronized (TrackLocalDataSource.class) {
                if (sInstance == null) {
                    sInstance = new TrackLocalDataSource(context);
                }
            }
        }
        return sInstance;
    }

    @Override
    public void getLocalTrack(TrackDataSource.DataCallback<Track> callback) {

    }

    @Override
    public void getFavoriteTracks(TrackDataSource.DataCallback<Track> callback) {

    }

    @Override
    public void getRecentTrack(TrackDataSource.DataCallback<Track> callback) {

    }

    @Override
    public void addFavoriteTrack(Track track, TrackDataSource.DataCallback<Track> callback) {

    }

    @Override
    public void deleteFavoriteTrack(Track track, TrackDataSource.DataCallback<Track> callback) {

    }
}

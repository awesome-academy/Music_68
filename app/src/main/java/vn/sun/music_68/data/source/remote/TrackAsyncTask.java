package vn.sun.music_68.data.source.remote;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import vn.sun.music_68.base.BaseAsyncTask;
import vn.sun.music_68.data.model.Track;
import vn.sun.music_68.data.source.TrackDataSource;
import vn.sun.music_68.utils.TrackEntity;

public class TrackAsyncTask extends BaseAsyncTask<Track> {
    public TrackAsyncTask(TrackDataSource.DataCallback<Track> callback) {
        super(callback);
    }

    @Override
    public List<Track> convertJSON(String jsonString) {
        List<Track> trackList = new ArrayList<>();
        try {
            JSONObject result = new JSONObject(jsonString);
            JSONArray collection = new JSONArray(TrackEntity.COLLECTION);
            for (int index = 0; index < collection.length(); index++) {
                JSONObject trackInfo = collection.getJSONObject(index);
                JSONObject track = trackInfo.getJSONObject(TrackEntity.TRACK);
                String title = track.getString(TrackEntity.TITLE);
                String artworkUrl = track.getString(TrackEntity.ARTWORK_URL);
                int id = track.getInt(TrackEntity.ID);
                String trackArtist = track.getJSONObject(TrackEntity.KEY_USER).getString(TrackEntity.KEY_USER_USERNAME);
                Track object = new Track(id, title, trackArtist);
                trackList.add(object);
            }
        } catch (JSONException e) {
            mException = e;
        }
        return trackList;
    }
}

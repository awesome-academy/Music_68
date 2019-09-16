package vn.sun.music_68.data.source.remote;

import android.util.Log;

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
            JSONArray collection = result.getJSONArray(TrackEntity.COLLECTION);
            for (int index = 0; index < collection.length(); index++) {
                JSONObject trackInfo = collection.getJSONObject(index);
                JSONObject trackJson = trackInfo.getJSONObject(TrackEntity.TRACK);
                Track track = new Track(trackJson);
                trackList.add(track);
            }
        } catch (JSONException e) {
            mException = e;
        }
        return trackList;
    }
}

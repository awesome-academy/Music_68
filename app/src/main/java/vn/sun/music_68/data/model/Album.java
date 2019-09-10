package vn.sun.music_68.data.model;

import java.util.List;

public class Album {
    private int mId;
    private String mName;
    private String mDescription;
    private int mTrackCount;
    private List<Integer> mTrackId;
    private String mArtworkUrl;

    public Album(int id, int trackCount) {
        mId = id;
        mTrackCount = trackCount;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getTrackCount() {
        return mTrackCount;
    }

    public void setTrackCount(int trackCount) {
        mTrackCount = trackCount;
    }

    public List<Integer> getTrackId() {
        return mTrackId;
    }

    public void setTrackId(List<Integer> trackId) {
        mTrackId = trackId;
    }

    public String getArtworkUrl() {
        return mArtworkUrl;
    }

    public void setArtworkUrl(String artworkUrl) {
        mArtworkUrl = artworkUrl;
    }
}


package vn.sun.music_68.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONException;
import org.json.JSONObject;

import vn.sun.music_68.utils.StringUtils;
import vn.sun.music_68.utils.TrackEntity;

public class Track implements Parcelable {
    private int mId;
    private String mTitle;
    private int mDuration;
    private String mGenre;
    private String mStreamUrl;
    private String mDownloadUrl;
    private boolean mDownloadable;
    private String mArtist;
    private String mAlbumTitle;
    private String mArtworkUrl;

    public Track(JSONObject trackJson) throws JSONException {
        mId = trackJson.getInt(TrackEntity.ID);
        mTitle = trackJson.getString(TrackEntity.TITLE);
        mDuration = trackJson.getInt(TrackEntity.DURATION);
        mArtist = trackJson.getJSONObject(TrackEntity.KEY_USER).getString(TrackEntity.KEY_USER_USERNAME);
        mArtworkUrl = trackJson.getString(TrackEntity.ARTWORK_URL);
        mStreamUrl = StringUtils.initStreamApi(mId);
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public int getDuration() {
        return mDuration;
    }

    public void setDuration(int duration) {
        mDuration = duration;
    }

    public String getGenre() {
        return mGenre;
    }

    public void setGenre(String genre) {
        mGenre = genre;
    }

    public String getStreamUrl() {
        return mStreamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        mStreamUrl = streamUrl;
    }

    public String getDownloadUrl() {
        return mDownloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        mDownloadUrl = downloadUrl;
    }

    public boolean isDownloadable() {
        return mDownloadable;
    }

    public void setDownloadable(boolean downloadable) {
        mDownloadable = downloadable;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        mArtist = artist;
    }

    public String getAlbumTitle() {
        return mAlbumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        mAlbumTitle = albumTitle;
    }

    public String getArtworkUrl() {
        return mArtworkUrl;
    }

    public void setArtworkUrl(String artworkUrl) {
        mArtworkUrl = artworkUrl;
    }

    public static Creator<Track> getCREATOR() {
        return CREATOR;
    }

    protected Track(Parcel in) {
        mId = in.readInt();
        mTitle = in.readString();
        mDuration = in.readInt();
        mGenre = in.readString();
        mStreamUrl = in.readString();
        mDownloadUrl = in.readString();
        mDownloadable = in.readByte() != 0;
        mArtist = in.readString();
        mAlbumTitle = in.readString();
        mArtworkUrl = in.readString();
    }

    public Track(int id, String title, String artist, String artworkUrl) {
        mId = id;
        mTitle = title;
        mArtist = artist;
        mArtworkUrl = artworkUrl;
    }

    public static final Creator<Track> CREATOR = new Creator<Track>() {
        @Override
        public Track createFromParcel(Parcel in) {
            return new Track(in);
        }

        @Override
        public Track[] newArray(int size) {
            return new Track[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mId);
        dest.writeString(mTitle);
        dest.writeInt(mDuration);
        dest.writeString(mGenre);
        dest.writeString(mStreamUrl);
        dest.writeString(mDownloadUrl);
        dest.writeByte((byte) (mDownloadable ? 1 : 0));
        dest.writeString(mArtist);
        dest.writeString(mAlbumTitle);
        dest.writeString(mArtworkUrl);
    }
}

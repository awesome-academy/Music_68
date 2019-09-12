package vn.sun.music_68.data.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Genres implements Parcelable {
    private String mKey;
    private String mName;
    private int mPhoto;

    public Genres(@GenreKey String key, @GenreName String name, int photo) {
        mKey = key;
        mName = name;
        mPhoto = photo;
    }

    public Genres() {

    }

    protected Genres(Parcel in) {
        mKey = in.readString();
        mName = in.readString();
        mPhoto = in.readInt();
    }

    public static final Creator<Genres> CREATOR = new Creator<Genres>() {
        @Override
        public Genres createFromParcel(Parcel in) {
            return new Genres(in);
        }

        @Override
        public Genres[] newArray(int size) {
            return new Genres[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mKey);
        dest.writeString(mName);
        dest.writeInt(mPhoto);
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        mKey = key;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getPhoto() {
        return mPhoto;
    }

    public void setPhoto(int photo) {
        mPhoto = photo;
    }

    public static Creator<Genres> getCREATOR() {
        return CREATOR;
    }
}

package vn.sun.music_68.mediaplayer;

public class MediaPlayerSetting {
    protected int mLoopType;
    protected int mShuffleType;

    public int getShuffleType() {
        return mShuffleType;
    }

    public MediaPlayerSetting setShuffleType(int shuffleType) {
        mShuffleType = shuffleType;
        return this;
    }

    @MediaPlayerLoopType
    public int getLoopType() {
        return mLoopType;
    }

    public void setLoopType(@MediaPlayerLoopType int loopType) {
        mLoopType = loopType;
    }
}

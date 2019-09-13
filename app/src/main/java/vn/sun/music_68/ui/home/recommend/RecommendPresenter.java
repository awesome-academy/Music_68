package vn.sun.music_68.ui.home.recommend;

import java.util.List;

import vn.sun.music_68.data.model.Track;
import vn.sun.music_68.data.repository.TrackRepository;
import vn.sun.music_68.data.source.TrackDataSource;

public class RecommendPresenter implements RecommendContract.Presenter {
    private RecommendContract.View mView;
    private TrackRepository mRepository;

    public RecommendPresenter(RecommendContract.View view, TrackRepository repository) {
        mView = view;
        mRepository = repository;
    }

    @Override
    public void getTrack(String api) {
        mRepository.getTracks(api, new TrackDataSource.DataCallback<Track>() {
            @Override
            public void onSuccess(List<Track> data) {
                mView.onShowTrack(data);
            }

            @Override
            public void onFailure(String message) {
                mView.onLoadFail(message);
            }
        });
    }

}

package vn.sun.music_68.ui.genres;

import java.util.List;

import vn.sun.music_68.data.model.Track;
import vn.sun.music_68.data.repository.TrackRepository;
import vn.sun.music_68.data.source.TrackDataSource;

public class GenresPresenter implements GenresContract.Presenter {
    private GenresContract.View mView;
    private TrackRepository mRepository;

    public GenresPresenter(TrackRepository repository, GenresContract.View view) {
        mView = view;
        mRepository = repository;
    }

    @Override
    public void getTrack(String api) {
        mRepository.getTracks(api, new TrackDataSource.DataCallback<Track>() {
            @Override
            public void onSuccess(List<Track> datas) {

            }

            @Override
            public void onFailure(String message) {

            }
        });
    }
}

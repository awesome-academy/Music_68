package vn.sun.music_68.base;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import vn.sun.music_68.data.source.TrackDataSource;
import vn.sun.music_68.utils.Constants;

public abstract class BaseAsyncTask<T> extends AsyncTask<String, T, List<T>> {
    public TrackDataSource.DataCallback<T> mCallback;
    public Exception mException;
    private HttpURLConnection mURLConnection;

    public BaseAsyncTask(TrackDataSource.DataCallback<T> callback) {
        mCallback = callback;
    }

    @Override
    protected List<T> doInBackground(String... strings) {
        String respond = "";
        try {
            URL url = new URL(strings[0]);
            mURLConnection = (HttpURLConnection) url.openConnection();
            mURLConnection.setRequestMethod(Constants.REQUEST_METHOD);
            mURLConnection.setConnectTimeout(Constants.CONNECT_TIMEOUT);
            mURLConnection.setReadTimeout(Constants.READ_TIMEOUT);
            mURLConnection.connect();
            InputStream inputStream = mURLConnection.getInputStream();
            respond = formatRespond(inputStream);
        } catch (IOException e) {
            mException = e;
        }
        return convertJSON(respond);
    }
    @Override
    protected void onPostExecute(List<T> ts) {
        super.onPostExecute(ts);
        if (mException == null) {
            mCallback.onSuccess(ts);
        } else {
            mCallback.onFailure(mException.getMessage());
        }
    }

    private String formatRespond(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            builder.append(line);
        }
        bufferedReader.close();
        return builder.toString();
    }

    public abstract List<T> convertJSON(String jsonString);
}

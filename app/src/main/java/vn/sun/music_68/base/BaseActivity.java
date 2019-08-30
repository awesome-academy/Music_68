package vn.sun.music_68.base;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());
        initViews(savedInstanceState);
    }

    protected abstract int getLayoutResourceId();

    protected abstract void initViews(Bundle savedInstanceState);
}

package vn.sun.music_68.ui.splashscreen;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import vn.sun.music_68.ui.home.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(MainActivity.getIntent(this));
        finish();
    }
}

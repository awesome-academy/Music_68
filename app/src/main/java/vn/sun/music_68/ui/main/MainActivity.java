package vn.sun.music_68.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import vn.sun.music_68.R;
import vn.sun.music_68.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {

    }

    public static Intent getIntent (Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

}

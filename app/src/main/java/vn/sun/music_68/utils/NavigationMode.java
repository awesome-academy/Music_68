package vn.sun.music_68.utils;

import androidx.annotation.IntDef;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({NavigationMode.ZERO,
        NavigationMode.ONE,
        NavigationMode.TWO})
@Retention(RetentionPolicy.SOURCE)
public @interface NavigationMode {
    int ZERO = 0;
    int ONE = 1;
    int TWO = 2;
}

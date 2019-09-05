package vn.sun.music_68.ui.bottomsheetfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import vn.sun.music_68.R;

public class BottomSheetFragment extends BottomSheetDialogFragment {
    public BottomSheetFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_bottom_sheet, container, false);
    }

    public static BottomSheetFragment getInstance() {
        BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
        return bottomSheetFragment;
    }
}

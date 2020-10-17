package com.birthday.keshus21.ui.slideshow;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.widget.*;
import com.birthday.keshus21.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;

public class SlideshowFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_slideshow, container, false);
        VideoView vd=v.findViewById(R.id.vd);
        String video="android.resource://com.birthday.keshus21/" +R.raw.video;
        Uri uri=Uri.parse(video);
        vd.setVideoURI(uri);
        MediaController md =new MediaController(getActivity());
        vd.setMediaController(md);
        md.setAnchorView(vd);
        vd.requestFocus();
        vd.start();

        return v;
    }
}
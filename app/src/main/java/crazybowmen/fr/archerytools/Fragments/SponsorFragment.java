package crazybowmen.fr.archerytools.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import crazybowmen.fr.archerytools.R;
import crazybowmen.fr.archerytools.SponsorsActivity;

/**
 * Created by pkshetlie on 28/01/2016.
 */
public  class SponsorFragment extends Fragment {

    public SponsorFragment() {
    }


//    public static SponsorFragment newInstance() {
//        SponsorFragment fragment = new SponsorFragment();
//        Bundle args = new Bundle();
//        fragment.setArguments(args);
//    args.putInt(ARG_SECTION_NUMBER, sectionNumber);
//        return fragment;
//    }
//            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sponsors, container, false);

        // sponsor star flandersarchery
        ImageButton imgBtn = (ImageButton) rootView.findViewById(R.id.flanders_archerie_img_btn);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.flandersarcheryshop.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        // sponsor star archerie
        ImageButton imgBtn2 = (ImageButton) rootView.findViewById(R.id.star_archerie_img_btn);
        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.star-archerie.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        return rootView;
    }
}


package crazybowmen.fr.archerytools.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import crazybowmen.fr.archerytools.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link EntrainementFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link EntrainementFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EntrainementFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_entrainement, container, false);

        return rootView;
    }
}

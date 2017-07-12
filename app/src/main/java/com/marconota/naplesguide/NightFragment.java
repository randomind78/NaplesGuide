package com.marconota.naplesguide;

/**
 * Created by Marco on 11/07/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NightFragment extends Fragment {

    public NightFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

// Create a list of places
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.Hbtoo_title, R.string.Hbtoo_description,
                R.string.Hbtoo_address, R.drawable.hbtoo));
        places.add(new Places(R.string.Arenile_title, R.string.Arenile_description,
                R.string.Arenile_address, R.drawable.arenile));
        places.add(new Places(R.string.Mela_title, R.string.Mela_description,
                R.string.Mela_address, R.drawable.mela));
        places.add(new Places(R.string.Naif_title, R.string.Naif_description,
                R.string.Naif_address, R.drawable.naif));
        places.add(new Places(R.string.Singha_title, R.string.Singha_description,
                R.string.Singha_address, R.drawable.singha));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Places} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}

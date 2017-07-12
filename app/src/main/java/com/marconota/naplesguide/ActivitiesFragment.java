
package com.marconota.naplesguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitiesFragment extends Fragment {

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

// Create a list of places
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.Casteldellovo_title, R.string.Casteldellovo_description,
                R.drawable.casteldellovo));
        places.add(new Places(R.string.Castelsantelmo_title, R.string.Castelsantelmo_description,
                R.drawable.castelsantelmo));
        places.add(new Places(R.string.Cristovelato_title, R.string.Cristovelato_description,
                R.drawable.cristovelato));
        places.add(new Places(R.string.Napolisotterranea_title, R.string.Napolisotterranea_description,
                R.drawable.napolisotterranea));
        places.add(new Places(R.string.Maschioangioino_title, R.string.Maschioangioino_description,
                R.drawable.maschioangioino));

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
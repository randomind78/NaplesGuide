/**
 * Created by Marco on 11/07/2017.
 */

package com.marconota.naplesguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CoffeeFragment extends Fragment {

    public CoffeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

// Create a list of places
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.Caffè_professore_title, R.string.Caffè_professore_description,
                R.string.Caffè_professore_address, R.drawable.caffedelprofessore));
        places.add(new Places(R.string.Caffettiera_title, R.string.Caffettiera_description,
                R.string.Caffettiera_address, R.drawable.caffettiera));
        places.add(new Places(R.string.Cimmino_title, R.string.Cimmino_description,
                R.string.Cimmino_address, R.drawable.cimmino));
        places.add(new Places(R.string.Gabrinus_title, R.string.Gabrinus_description,
                R.string.Gabrinus_address, R.drawable.gambrinus));
        places.add(new Places(R.string.Serpentone_title, R.string.Serpentone_description,
                R.string.Serpentone_address, R.drawable.serpentone));
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

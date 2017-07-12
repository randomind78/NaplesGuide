
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

public class EatingFragment extends Fragment {

    public EatingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

// Create a list of places
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.Bfactory_title, R.string.Bfactory_description,
                R.string.Bfactory_address, R.drawable.b_factory));
        places.add(new Places(R.string.Ilpostoaccanto_title, R.string.Ilpostoaccanto_description,
                R.string.Ilpostoaccanto_address, R.drawable.il_posto_accanto));
        places.add(new Places(R.string.Muuzzarella_title, R.string.Muuzzarella_description,
                R.string.Muuzzarella_address, R.drawable.muuzzarella_imageview));
        places.add(new Places(R.string.Terrazza_Calabritto_title, R.string.Terrazza_Calabritto_description,
                R.string.Terrazza_Calabritto_address, R.drawable.terrazza_calabritto));
        places.add(new Places(R.string.Ziteresa_title, R.string.Ziteresa_description,
                R.string.Ziteresa_address, R.drawable.zi_teresa));
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

package com.ufidstudios.igt.gamestatus.view;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ufidstudios.igt.gamestatus.R;
import com.ufidstudios.igt.gamestatus.model.valueobjects.GameData;
import com.ufidstudios.igt.gamestatus.model.GameDataCollection;
import com.ufidstudios.igt.gamestatus.network.RetrofitClient;

import javax.inject.Inject;

/**
 * A fragment representing a single GameDataCollection detail screen.
 * This fragment is either contained in a {@link JackpotListActivity}
 * in two-pane mode (on tablets) or a {@link JackpotDetailActivity}
 * on handsets.
 */
public class JackpotDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    @Inject RetrofitClient retrofit;


    /**
     * The dummy content this fragment is presenting.
     */
    private GameData mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public JackpotDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = GameDataCollection.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.getName());
            }
        }

        retrofit.notify();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jackpot_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
           // ((TextView) rootView.findViewById(R.id.jackpot_detail)).setText(mItems.getJackpot());
        }

        return rootView;
    }
}

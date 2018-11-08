package unicorp.com.mynewapp.Fragments.Orders;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import unicorp.com.mynewapp.R;

public class TrackOrdersFragment extends Fragment {
    private RecyclerView mRecyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_orders_track, container, false);
        // Inflate the layout for this
        mRecyclerView = view.findViewById(R.id.RecyclerOrders_Track);

        return view;
    }

}

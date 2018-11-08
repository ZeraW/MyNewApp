package unicorp.com.mynewapp.Fragments.Orders;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import unicorp.com.mynewapp.R;

public class PendingOrdersFragment extends Fragment {
    private RecyclerView mRecyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_orders_pending, container, false);
        // Inflate the layout for this
        mRecyclerView = view.findViewById(R.id.RecyclerOrders_Pending);

        return view;
    }

}

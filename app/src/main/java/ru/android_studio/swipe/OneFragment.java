package ru.android_studio.swipe;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OneFragment extends Fragment {

    private int id;

    public OneFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            id = savedInstanceState.getInt("id");
        } else {
            id = getArguments().getInt("id");
        }
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            id = savedInstanceState.getInt("id");
        } else {
            id = getArguments().getInt("id");
        }


        View view = inflater.inflate(R.layout.one_fragment, container, false);
        TextView titleTextView = (TextView) view.findViewById(R.id.order_id);
        titleTextView.setText("orderId: " + id);

        return view;
    }
}

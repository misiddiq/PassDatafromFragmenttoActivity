package com.example.passdatafromfragmenttoactivity;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {

    EditText e1, e2;
    Button b;

    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_my, container, false);

        e1 = (EditText) v.findViewById(R.id.fragText1);
        e2 = (EditText) v.findViewById(R.id.fragText2);
        b = (Button) v.findViewById(R.id.fragButton1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                String address = e2.getText().toString();
                MainActivity m1 = (MainActivity) getActivity();
                m1.f1(name, address);
                e1.setText("");
                e2.setText("");
            }
        });

        return v;
    }

}

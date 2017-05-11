package com.example.nico.fragmentdemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment implements View.OnClickListener{



    private Button btn_2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two_layout, container, false);
        btn_2 = (Button) view.findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);
        return view;
    }


    public void changeFrag() {
        try {
            ((ComunicationWithActivity) getActivity()).doChangeFragment(R.layout.fragment_two_layout);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_2){
            changeFrag();
        }
    }

}

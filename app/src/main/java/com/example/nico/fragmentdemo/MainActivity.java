package com.example.nico.fragmentdemo;

import android.app.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements ComunicationWithActivity {
    FragmentOne f1 = new FragmentOne();
    FragmentTwo f2 = new FragmentTwo();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFragment(R.id.fragment_container,f1);
    }


    private void setFragment(int containerViewId, Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .replace(containerViewId, fragment)
                .addToBackStack(String.valueOf(containerViewId))
                .commit();
    }

    @Override
    public void doChangeFragment(int id) {
        switch (id){
            case R.layout.fragment_one_layout:
                setFragment(R.id.fragment_container,f2);
                break;
            case R.layout.fragment_two_layout:
                setFragment(R.id.fragment_container,f1);
                break;
        }
    }
}

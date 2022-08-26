package com.kasimkartal866.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.mainActivityFragment,new LoginFragment(), "fragment")
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();


    }
}
package com.kasimkartal866.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginFragment extends Fragment {

    View view;
    TextView kadi;
    TextView kadiText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_login, container, false);
        return view;
    }

    public void define () {
        kadi = view.findViewById(R.id.kadi);
        kadiText = view.findViewById(R.id.kadiText);
        button = view.findViewById(R.id.button);

    }
}
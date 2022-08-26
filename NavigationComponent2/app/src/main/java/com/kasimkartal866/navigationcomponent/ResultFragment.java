package com.kasimkartal866.navigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.badge.BadgeUtils;

public class ResultFragment extends Fragment {

    private Button buttonnBack;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View design = inflater.inflate(R.layout.fragment_result, container, false);

        buttonnBack = design.findViewById(R.id.buttonnBack);
        buttonnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Navigation.findNavController(view).navigate(ResultFragmentDirections.backGamePage());
                Navigation.findNavController(view).popBackStack();
            }
        });
        return design;
    }
}
package com.kasimkartal866.navigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class GamePageFragment extends Fragment {
    private Button buttonResult, btnBack;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View design = inflater.inflate(R.layout.fragment_game_page, container, false);
        buttonResult = design.findViewById(R.id.buttonResult);
        GamePageFragmentArgs bundle = GamePageFragmentArgs.fromBundle(getArguments());

        String name = bundle.getName();
        int age = bundle.getAge();
        float length = bundle.getLength();
        boolean Celibacy = bundle.getCelibacy();
        Persons person = bundle.getObject();

        Log.e("gelen ad",name);
        Log.e("gelen yas",String.valueOf(age));
        Log.e("gelen boy",String.valueOf(length));
        Log.e("gelen bekarMi" ,String.valueOf(Celibacy));
        Log.e("gelen no",String.valueOf(person.getNo()));
        Log.e("gelen name",person.getName());

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.switchToResultScreen);
            }
        });
        return design;
    }
    @Override
    public void onViewCreated(@NonNull View v, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(v, savedInstanceState);
        btnBack = v.findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.homePageBack);
        });
    }
}
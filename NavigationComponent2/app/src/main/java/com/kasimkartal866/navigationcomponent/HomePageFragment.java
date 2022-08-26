package com.kasimkartal866.navigationcomponent;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomePageFragment extends Fragment {
    private Button buttonStart;
    private Button btnExit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View design = inflater.inflate(R.layout.fragment_home_page, container, false);
        design.findViewById(R.id.buttonExit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(getActivity()).setTitle("bilidirim")
                        .setMessage("çıkmak istiyor musunuz?")
                        .setNegativeButton("hayır",null)
                        .setPositiveButton("evet", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                getActivity().finish();

                            }
                        }).show();
            }
        });
        return design;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        buttonStart = view.findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Persons person = new Persons(1,"Kasım");
                HomePageFragmentDirections.SwitchToGameScreen gecis = HomePageFragmentDirections.switchToGameScreen(person);
                gecis.setName("Kasım");
                gecis.setAge(23);
                gecis.setLength(1.75f);
                gecis.setCelibacy(true);

                Navigation.findNavController(view).navigate(gecis);
            }
        });
    }
}
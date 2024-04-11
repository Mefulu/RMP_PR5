package com.example.myapplication_pr5;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.Navigation;
import android.widget.Button;

public class F_Screen extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f_screen, container, false);
        Button toSecondScreen = view.findViewById(R.id.to_s_screen);
        toSecondScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view)
                        .navigate(R.id.action_f_screen_to_s_screen);
                Bundle bundle = new Bundle();
                String transmission = "Передача данных с первого экрана";
                bundle.putString("transmission", transmission);
                Navigation.findNavController(view).navigate(R.id.S_Screen, bundle);
            }
        });
        return view;
    }
}
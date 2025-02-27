package com.example.myapplication_pr5;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class S_Screen extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.s_screen, container, false);
        Button toThirdScreen = view.findViewById(R.id.to_t_screen);
        toThirdScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view)
                        .navigate(R.id.action_s_screen_to_t_screen);
            }
        });
        String transmission = getArguments().getString("transmission");
        TextView text = view.findViewById(R.id.textViewLinearLayout);
        text.setText(transmission);
        return view;
    }
}
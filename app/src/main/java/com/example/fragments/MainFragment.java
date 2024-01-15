package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class MainFragment extends Fragment {

    private Integer counter = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tvCounter = requireActivity().findViewById(R.id.tv_counter);
        Button btnPlusOne = requireActivity().findViewById(R.id.btn_plus_one);
        Button btnMinusOne = requireActivity().findViewById(R.id.btn_minus_one);



        btnPlusOne.setOnClickListener(v -> {
            counter = Integer.parseInt(tvCounter.getText().toString());
            counter++;
            tvCounter.setText(counter.toString());
        });

        btnMinusOne.setOnClickListener(v -> {
            counter = Integer.parseInt(tvCounter.getText().toString());
            counter--;
            tvCounter.setText(counter.toString());
        });
    }
}
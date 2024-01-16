package com.example.ejercicio_2_menu_lateral.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.ejercicio_2_menu_lateral.R;

public class SlideShowFragment extends Fragment {
    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        return root;
    }
}

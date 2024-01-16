package com.example.ejercicio_2_menu_lateral.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejercicio_2_menu_lateral.R;

public class GalleryFragment extends Fragment {

    private RecyclerView recyclerView;
    private Button btnAccept, btnCancel;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        // Inicializar elementos de la interfaz
        recyclerView = root.findViewById(R.id.recyclerView);
        btnAccept = root.findViewById(R.id.btnAccept);
        btnCancel = root.findViewById(R.id.btnCancel);

        // Configurar el RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new ImageAdapter(getContext()));

        // Manejar clic en el botón "Accept"
        btnAccept.setOnClickListener(v -> {
            // Lógica cuando se hace clic en "Accept"
            // Puedes obtener los elementos seleccionados del RecyclerView si es necesario
        });

        // Manejar clic en el botón "Cancel"
        btnCancel.setOnClickListener(v -> {
            // Lógica cuando se hace clic en "Cancel"
        });

        return root;
    }
}

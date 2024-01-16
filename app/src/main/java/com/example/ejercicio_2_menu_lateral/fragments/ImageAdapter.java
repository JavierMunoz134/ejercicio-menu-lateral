package com.example.ejercicio_2_menu_lateral.fragments;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejercicio_2_menu_lateral.R;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private final Context context;
    private final int[] imageResIds = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9
    };

    private final String[] imageNames = {"Card 1", "Card 2", "Card 3", "Card 4", "Card 5", "Card 6", "Card 7", "Card 8", "Card 9"};

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image_card, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.imageView.setImageResource(imageResIds[position]);
        holder.textView.setText(imageNames[position]);
    }

    @Override
    public int getItemCount() {
        return imageNames.length;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        public ImageView imageView;
        public TextView textView;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            // Configura el menú contextual
            menu.setHeaderTitle("Opciones");
            menu.add(Menu.NONE, R.id.menu_edit, Menu.NONE, "Editar");
            menu.add(Menu.NONE, R.id.menu_delete, Menu.NONE, "Eliminar");
            menu.add(Menu.NONE, R.id.menu_share, Menu.NONE, "Compartir");
        }
    }
}

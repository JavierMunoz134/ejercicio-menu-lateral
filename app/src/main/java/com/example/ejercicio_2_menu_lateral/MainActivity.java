package com.example.ejercicio_2_menu_lateral;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Utilizamos el toolbar definido en content_main
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Más findViews
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navView = findViewById(R.id.navview);

        // Aquí determinamos que el fragment que está en content_main.xml será el anfitrión de la navegación
        // Se establece como punto central para mantener el estado de la navegación en tu aplicación.
        NavHostFragment navHostFragment = (NavHostFragment)
                getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);

        NavController navController = navHostFragment.getNavController();

        // Creamos un objeto de configuración para la Toolbar
        // Para que tenga en cuenta los destinos de navegación y qué tipo de menú se abrirá al pulsar
        appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawerLayout)
                .build();

        // Estas dos líneas integran todo: Toolbar, menú lateral y el NavController
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

    // Método para gestionar el botón de navegación de la Toolbar
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController =
                NavHostFragment.findNavController(getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment));
        return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
    }
}

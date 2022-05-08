package com.example.hitmovies.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import com.example.hitmovies.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        A navegação se refere às interações que permitem aos usuários navegar, entrar e sair
         de diferentes partes do conteúdo no aplicativo. O componente de navegação do Android
          Jetpack ajuda você a implementar a navegação, desde simples cliques em botões até
          padrões mais complexos, como barras de aplicativos e a gaveta de navegação. Esse
          componente também garante uma experiência do usuário consistente e previsível por
          meio da adesão a um conjunto de princípios estabelecido.
        */

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();

        NavigationUI.setupWithNavController(bottomNavigationView, navController);


    }
}
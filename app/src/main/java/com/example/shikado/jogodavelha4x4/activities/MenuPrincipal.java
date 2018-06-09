package com.example.shikado.jogodavelha4x4.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shikado.jogodavelha4x4.R;

public class MenuPrincipal extends AppCompatActivity {

    Button bt_singleplayer;
    Button bt_multiplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(this.getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_menu_principal);

        bt_singleplayer = findViewById(R.id.bt_singleplayer);
        bt_multiplayer = findViewById(R.id.bt_multiplayer);

        bt_multiplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo_jogo = new Intent(MenuPrincipal.this, Tabuleiro.class);
                novo_jogo.putExtra("GAME_MODE","MULTIPLAYER");
                startActivity(novo_jogo);
            }
        });
    }
}

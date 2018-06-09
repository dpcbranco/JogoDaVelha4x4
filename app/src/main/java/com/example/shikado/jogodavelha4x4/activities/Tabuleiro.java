package com.example.shikado.jogodavelha4x4.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shikado.jogodavelha4x4.R;

import jogodavelha.JogoDaVelha;

public class Tabuleiro extends AppCompatActivity {

    ImageView im_00, im_01, im_02, im_03, im_10, im_11, im_12, im_13, im_20, im_21, im_22, im_23, im_30, im_31, im_32, im_33;
    TextView tv_vez;
    JogoDaVelha partida;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        partida = new JogoDaVelha(getIntent().getExtras().getString("GAME_MODE"));

        inicializarTabuleiro();
    }

    private void inicializarTabuleiro(){

        tv_vez = findViewById(R.id.tv_vez);

        im_00 = findViewById(R.id.im_00);
        im_01 = findViewById(R.id.im_01);
        im_02 = findViewById(R.id.im_02);
        im_03 = findViewById(R.id.im_03);
        im_10 = findViewById(R.id.im_10);
        im_11 = findViewById(R.id.im_11);
        im_12 = findViewById(R.id.im_12);
        im_13 = findViewById(R.id.im_13);
        im_20 = findViewById(R.id.im_20);
        im_21 = findViewById(R.id.im_21);
        im_22 = findViewById(R.id.im_22);
        im_23 = findViewById(R.id.im_23);
        im_30 = findViewById(R.id.im_30);
        im_31 = findViewById(R.id.im_31);
        im_32 = findViewById(R.id.im_32);
        im_33 = findViewById(R.id.im_33);

        tv_vez.setText(partida.getVez());

        im_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (partida.getVez().equals("CRUZ")){
                    im_00.setImageResource(R.drawable.xis);
                }
                else{
                    im_00.setImageResource(R.drawable.circulo);
                }

                partida.jogada(0,0);
                tv_vez.setText(partida.getVez());
                im_00.setEnabled(false);
            }
        });

        im_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_01.setImageResource(R.drawable.xis);
                }
                else{
                    im_01.setImageResource(R.drawable.circulo);
                }

                partida.jogada(0,1);
                tv_vez.setText(partida.getVez());
                im_01.setEnabled(false);
            }
        });

        im_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_02.setImageResource(R.drawable.xis);
                }
                else{
                    im_02.setImageResource(R.drawable.circulo);
                }

                partida.jogada(0,2);
                tv_vez.setText(partida.getVez());
                im_02.setEnabled(false);
            }
        });

        im_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_03.setImageResource(R.drawable.xis);
                }
                else{
                    im_03.setImageResource(R.drawable.circulo);
                }

                partida.jogada(0,3);
                tv_vez.setText(partida.getVez());
                im_03.setEnabled(false);
            }
        });

        im_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_10.setImageResource(R.drawable.xis);
                }
                else{
                    im_10.setImageResource(R.drawable.circulo);
                }

                partida.jogada(1,0);
                tv_vez.setText(partida.getVez());
                im_10.setEnabled(false);
            }
        });

        im_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_11.setImageResource(R.drawable.xis);
                }
                else{
                    im_11.setImageResource(R.drawable.circulo);
                }

                partida.jogada(1,1);
                tv_vez.setText(partida.getVez());
                im_11.setEnabled(false);
            }
        });

        im_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_12.setImageResource(R.drawable.xis);
                }
                else{
                    im_12.setImageResource(R.drawable.circulo);
                }

                partida.jogada(1,2);
                tv_vez.setText(partida.getVez());
                im_12.setEnabled(false);
            }
        });

        im_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_13.setImageResource(R.drawable.xis);
                }
                else{
                    im_13.setImageResource(R.drawable.circulo);
                }

                partida.jogada(1,3);
                tv_vez.setText(partida.getVez());
                im_13.setEnabled(false);
            }
        });

        im_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_20.setImageResource(R.drawable.xis);
                }
                else{
                    im_20.setImageResource(R.drawable.circulo);
                }

                partida.jogada(2,0);
                tv_vez.setText(partida.getVez());
                im_20.setEnabled(false);
            }
        });

        im_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_21.setImageResource(R.drawable.xis);
                }
                else{
                    im_21.setImageResource(R.drawable.circulo);
                }

                partida.jogada(2,1);
                tv_vez.setText(partida.getVez());
                im_21.setEnabled(false);
            }
        });

        im_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_22.setImageResource(R.drawable.xis);
                }
                else{
                    im_22.setImageResource(R.drawable.circulo);
                }

                partida.jogada(2,2);
                tv_vez.setText(partida.getVez());
                im_22.setEnabled(false);
            }
        });

        im_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_23.setImageResource(R.drawable.xis);
                }
                else{
                    im_23.setImageResource(R.drawable.circulo);
                }

                partida.jogada(2,3);
                tv_vez.setText(partida.getVez());
                im_23.setEnabled(false);
            }
        });

        im_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_30.setImageResource(R.drawable.xis);
                }
                else{
                    im_30.setImageResource(R.drawable.circulo);
                }

                partida.jogada(3,0);
                tv_vez.setText(partida.getVez());
                im_30.setEnabled(false);
            }
        });

        im_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_31.setImageResource(R.drawable.xis);
                }
                else{
                    im_31.setImageResource(R.drawable.circulo);
                }

                partida.jogada(3,1);
                tv_vez.setText(partida.getVez());
                im_31.setEnabled(false);
            }
        });

        im_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_32.setImageResource(R.drawable.xis);
                }
                else{
                    im_32.setImageResource(R.drawable.circulo);
                }

                partida.jogada(3,2);
                tv_vez.setText(partida.getVez());
                im_32.setEnabled(false);
            }
        });

        im_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getVez().equals("CRUZ")){
                    im_33.setImageResource(R.drawable.xis);
                }
                else{
                    im_33.setImageResource(R.drawable.circulo);
                }

                partida.jogada(3,3);
                tv_vez.setText(partida.getVez());
                im_33.setEnabled(false);
            }
        });
    }

}

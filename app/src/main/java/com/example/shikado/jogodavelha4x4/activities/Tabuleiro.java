package com.example.shikado.jogodavelha4x4.activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shikado.jogodavelha4x4.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import jogodavelha.IA;
import jogodavelha.JogoDaVelha;

public class Tabuleiro extends AppCompatActivity {

    ImageView im_00, im_01, im_02, im_03, im_10, im_11, im_12, im_13, im_20, im_21, im_22, im_23, im_30, im_31, im_32, im_33;
    TextView tv_vez, tv_placar_cruz, tv_placar_bola;
    JogoDaVelha partida;
    int placar_cruz = 0, placar_bola = 0;
    List<ImageView> casas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        partida = new JogoDaVelha();

        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {

        tv_vez = findViewById(R.id.tv_vez);
        tv_placar_cruz = findViewById(R.id.tv_placar_cruz);
        tv_placar_bola = findViewById(R.id.tv_placar_bola);

        tv_placar_cruz.setText("0");
        tv_placar_bola.setText("0");

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

        casas.add(im_00);
        casas.add(im_01);
        casas.add(im_02);
        casas.add(im_03);
        casas.add(im_10);
        casas.add(im_11);
        casas.add(im_12);
        casas.add(im_13);
        casas.add(im_20);
        casas.add(im_21);
        casas.add(im_22);
        casas.add(im_23);
        casas.add(im_30);
        casas.add(im_31);
        casas.add(im_32);
        casas.add(im_33);

        tv_vez.setText(partida.getVez());
        if (getIntent().getExtras().getString("GAME_MODE").equals("MULTIPLAYER")) {
            im_00.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(0, 0, im_00);
                }
            });

            im_01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(0, 1, im_01);
                }
            });

            im_02.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(0, 2, im_02);
                }
            });

            im_03.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(0, 3, im_03);
                }
            });

            im_10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(1, 0, im_10);
                }
            });

            im_11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(1, 1, im_11);
                }
            });

            im_12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(1, 2, im_12);
                }
            });

            im_13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(1, 3, im_13);
                }
            });

            im_20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(2, 0, im_20);
                }
            });

            im_21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(2, 1, im_21);
                }

            });

            im_22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(2, 2, im_22);
                }
            });

            im_23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(2, 3, im_23);
                }
            });

            im_30.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(3, 0, im_30);
                }
            });

            im_31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(3, 1, im_31);
                }
            });

            im_32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(3, 2, im_32);
                }
            });

            im_33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarMultiPlayer(3, 3, im_33);
                }
            });

        } else {
            im_00.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(0, 0, im_00);
                }
            });

            im_01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(0, 0, im_01);
                }
            });

            im_02.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(0, 2, im_02);
                    ;
                }
            });

            im_03.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(0, 3, im_03);
                }
            });

            im_10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(1, 0, im_10);
                }
            });

            im_11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(1, 1, im_11);
                }
            });

            im_12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(1, 2, im_12);
                }
            });

            im_13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(1, 3, im_13);
                }
            });

            im_20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(2, 0, im_20);
                }
            });

            im_21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(2, 1, im_21);
                }

            });

            im_22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(2, 2, im_22);
                }
            });

            im_23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(2, 3, im_23);
                }
            });

            im_30.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(3, 0, im_30);
                }
            });

            im_31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(3, 1, im_31);
                }
            });

            im_32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(3, 2, im_32);
                }
            });

            im_33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogarSinglePlayer(3, 3, im_33);
                }
            });
        }
    }

    private void jogarSinglePlayer(int linha, int coluna, ImageView im) {
        AlertDialog.Builder builder_msg = new AlertDialog.Builder(this);
        AlertDialog msg_vencedor;

        im.setEnabled(false);

        IA computador = new IA();
        int jogada_computador;

        im.setImageResource(R.drawable.xis);
        partida.jogada(linha, coluna);

        if (partida.vitoria(linha, coluna)) {

            builder_msg.setTitle("VENCEDOR: CRUZ!");
            builder_msg.setCancelable(true);
            builder_msg.setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            msg_vencedor = builder_msg.create();
            msg_vencedor.show();

            placar_cruz++;
            tv_placar_cruz.setText((Integer.toString(placar_cruz)));
            limparTabuleiro();
        } else if (partida.empate()) {
            limparTabuleiro();
        }

        partida.passarVez();
        tv_vez.setText(partida.getVez());


        jogada_computador = computador.jogar(partida.getTabuleiro());
        im = casas.get(jogada_computador);


        im.setEnabled(false);

        im.setImageResource(R.drawable.circulo);
        partida.jogada(jogada_computador/4, jogada_computador%4);

        if (partida.vitoria(jogada_computador/4, jogada_computador%4)) {

            builder_msg.setTitle("VENCEDOR: BOLA!");
            builder_msg.setCancelable(true);
            builder_msg.setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            msg_vencedor = builder_msg.create();
            msg_vencedor.show();

            placar_bola++;
            tv_placar_bola.setText(Integer.toString(placar_bola));
            limparTabuleiro();

        } else if (partida.empate()) {
            builder_msg.setTitle("EMPATE!");
            builder_msg.setCancelable(true);
            builder_msg.setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            msg_vencedor = builder_msg.create();
            msg_vencedor.show();
            limparTabuleiro();
        }


        partida.passarVez();
        tv_vez.setText(partida.getVez());
    }

    private void jogarMultiPlayer(int linha, int coluna, ImageView im) {

        AlertDialog.Builder builder_msg = new AlertDialog.Builder(this);
        AlertDialog msg_vencedor;

        im.setEnabled(false);

        if (partida.getVez().equals("CRUZ")) {
            im.setImageResource(R.drawable.xis);
            partida.jogada(linha, coluna);

            if (partida.vitoria(linha, coluna)) {

                builder_msg.setTitle("VENCEDOR: CRUZ!");
                builder_msg.setCancelable(true);
                builder_msg.setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                msg_vencedor = builder_msg.create();
                msg_vencedor.show();

                placar_cruz++;
                tv_placar_cruz.setText((Integer.toString(placar_cruz)));
                limparTabuleiro();
            } else if (partida.empate()) {
                limparTabuleiro();
            }
        } else {
            im.setImageResource(R.drawable.circulo);
            partida.jogada(linha, coluna);

            if (partida.vitoria(linha, coluna)) {

                builder_msg.setTitle("VENCEDOR: BOLA!");
                builder_msg.setCancelable(true);
                builder_msg.setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                msg_vencedor = builder_msg.create();
                msg_vencedor.show();

                placar_bola++;
                tv_placar_bola.setText(Integer.toString(placar_bola));
                limparTabuleiro();
            } else if (partida.empate()) {
                builder_msg.setTitle("EMPATE!");
                builder_msg.setCancelable(true);
                builder_msg.setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                msg_vencedor = builder_msg.create();
                msg_vencedor.show();
                limparTabuleiro();
            }
        }

        partida.passarVez();
        tv_vez.setText(partida.getVez());
    }


    private void limparTabuleiro() {

        im_00.setImageDrawable(null);
        im_01.setImageDrawable(null);
        im_02.setImageDrawable(null);
        im_03.setImageDrawable(null);
        im_10.setImageDrawable(null);
        im_11.setImageDrawable(null);
        im_12.setImageDrawable(null);
        im_13.setImageDrawable(null);
        im_20.setImageDrawable(null);
        im_21.setImageDrawable(null);
        im_22.setImageDrawable(null);
        im_23.setImageDrawable(null);
        im_30.setImageDrawable(null);
        im_31.setImageDrawable(null);
        im_32.setImageDrawable(null);
        im_33.setImageDrawable(null);

        im_00.setEnabled(true);
        im_01.setEnabled(true);
        im_02.setEnabled(true);
        im_03.setEnabled(true);
        im_10.setEnabled(true);
        im_11.setEnabled(true);
        im_12.setEnabled(true);
        im_13.setEnabled(true);
        im_20.setEnabled(true);
        im_21.setEnabled(true);
        im_22.setEnabled(true);
        im_23.setEnabled(true);
        im_30.setEnabled(true);
        im_31.setEnabled(true);
        im_32.setEnabled(true);
        im_33.setEnabled(true);

    }

}

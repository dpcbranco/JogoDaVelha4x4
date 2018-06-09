package jogodavelha;

import java.util.Arrays;

public class JogoDaVelha {

    private char tabuleiro [][] = new char[4][4];
    private String vez = "CRUZ";
    private int cruz = 0, bola = 0;

    public  JogoDaVelha (String modo){
        for (char[] linha: tabuleiro){
            Arrays.fill(linha, '-');
        }
    }

     public void jogada(int linha, int coluna){
        if (vez.equals("CRUZ")){
            tabuleiro[linha][coluna] = 'X';
            vez = "BOLA";
        }
        else{
            tabuleiro[linha][coluna] = 'O';
            vez = "CRUZ";
        }

        if (empate()){
            //Gerar alerta
            //Zera tabuleiro
        }

        else if (vitoria(linha, coluna)){
            //Gerar vitoria

            if (vez.equals(("CRUZ"))){
                cruz++;
            }

            else{
                bola++;
            }

        }
    }

    private boolean vitoria(int linha, int coluna) {
        //Verifica linha
        for (int i = 1; i < 4; i++){
            if (tabuleiro[linha][i] == '-' || tabuleiro[linha][i-1] != tabuleiro[linha][i]){
                return false;
            }
        }

        //Verifica coluna
        for (int i = 1; i < 4; i++){
            if (tabuleiro[i][coluna] == '-' || tabuleiro[i-1][coluna] != tabuleiro[i][coluna]){
                return false;
            }
        }

        //Verifica diagonais
        for (int i = 1, j = 1; i < 4; i++, j++){
            if(tabuleiro[i][j] == '-' || tabuleiro[i-1][j-1] != tabuleiro[i][j]){
                return false;
            }
        }

        for (int i = 4, j = 1; j < 4; i--, j++){
            if(tabuleiro[i][j] == '-' || tabuleiro[i+1][j-1] != tabuleiro[i][j]){
                return false;
            }
        }

        return true;
    }

    private boolean empate() {

        for (char[] linha: tabuleiro){
            if (Arrays.binarySearch(linha, '-')  >= 0){
                return false;
            }
        }

        return true;
    }

    public String getVez() {
        return vez;
    }
}

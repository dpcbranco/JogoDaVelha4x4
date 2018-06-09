package jogodavelha;

import java.util.Arrays;

public class JogoDaVelha {

    private char tabuleiro [][] = new char[4][4];
    private String vez = "CRUZ";

    public  JogoDaVelha (String modo){
        zerarTabuleiro();
    }

     public void jogada(int linha, int coluna){
        if (vez.equals("CRUZ")){
            tabuleiro[linha][coluna] = 'X';
        }
        else{
            tabuleiro[linha][coluna] = 'O';
        }
    }

    public void passarVez(){
        if (vez.equals("CRUZ")){
            vez = "BOLA";
        }
        else{
            vez = "CRUZ";
        }
    }

    //Obtém coluna e linha da jogada para facilitar testes
    public boolean vitoria(int linha, int coluna) {

        boolean retorno = true;

        //Verifica linha
        for (int i = 1; i < 4; i++) {
            if (tabuleiro[linha][i] == '-' || tabuleiro[linha][i - 1] != tabuleiro[linha][i]) {
                retorno = false;
                break;
            }
        }

        if (!retorno){

            retorno = true;

            //Verifica coluna
            for (int i = 1; i < 4; i++) {
                if (tabuleiro[i][coluna] == '-' || tabuleiro[i - 1][coluna] != tabuleiro[i][coluna]) {
                    retorno = false;
                    break;
                }
            }

        }

        if (!retorno) {

            retorno = true;

            //Verifica diagonais
            for (int i = 1, j = 1; i < 4; i++, j++) {
                if (tabuleiro[i][j] == '-' || tabuleiro[i - 1][j - 1] != tabuleiro[i][j]) {
                    retorno = false;
                    break;
                }
            }
        }

        if (!retorno) {

            retorno = true;

            for (int i = 2, j = 1; j < 4; i--, j++) {
                if (tabuleiro[i][j] == '-' || tabuleiro[i + 1][j - 1] != tabuleiro[i][j]) {
                    retorno = false;
                    break;
                }
            }
        }


        if (retorno){
            zerarTabuleiro();
        }

        return retorno;
    }

    public boolean empate() {

        for (char[] linha: tabuleiro){
            for (char coluna: linha){
                if (coluna == '-'){
                    return false;
                }
            }
        }

        zerarTabuleiro();
        return true;
    }

    public String getVez() {
        return vez;
    }

    private void zerarTabuleiro(){
        for (char[] linha: tabuleiro){
            Arrays.fill(linha, '-');
        }
    }
}

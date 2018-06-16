package jogodavelha;

import java.util.Random;

public class IA {
    private char[][] tabuleiro;

    public int jogar(char tabuleiro[][]){

        this.tabuleiro = tabuleiro;

        int jogada = 0;

        if ((jogada = condicaoVitoria('O')) >= 0){
            return jogada;
        }

        if ((jogada = condicaoVitoria('X')) >= 0){
            return jogada;
        }

        do {
            jogada = new Random().nextInt(15);
        }while (tabuleiro[jogada/4][jogada%4] != '-');

        return jogada;
    }

    //Testa linhas/colunas/diagonais com 3 simbolos iguais
    private int condicaoVitoria(char simbolo) {
        int contador;

        //Testa linhas
        for (int linha = 0; linha < 4; linha++){
            contador = contaLinha(linha, simbolo);
            if (contador == 3){
                for (int coluna = 0; coluna < 4; coluna++){
                    if (tabuleiro[linha][coluna] == '-'){
                        return  (linha*4) + coluna;
                    }
                    else if (tabuleiro[linha][coluna] != simbolo){
                        break;
                    }
                }
            }
        }

        //Teste colunas
        for (int coluna = 0; coluna < 4; coluna++){
            contador = contaColuna(coluna, simbolo);
            if (contador == 3){
                for (int linha = 0; linha < 4; linha++){
                    if (tabuleiro[linha][coluna] == '-'){
                        return  (linha*4) + coluna;
                    }
                    else if (tabuleiro[linha][coluna] != simbolo){
                        break;
                    }
                }
            }
        }

        contador = contaDiagonalPrincipal(simbolo);
        if (contador == 3){
            for (int linha = 0, coluna = 0; linha < 4; linha++, coluna++){
               if (tabuleiro[linha][coluna] == '-'){
                   return  (linha*4) + coluna;
               }
               else if (tabuleiro[linha][coluna] != simbolo){
                   break;
               }
            }
        }

        contador = contaDiagonalReversa(simbolo);
        if (contador == 3){
            for (int linha = 0, coluna = 3; linha < 4; linha++, coluna--){
                if (tabuleiro[linha][coluna] == '-'){
                    return  (linha*4) + coluna;
                }
                else if (tabuleiro[linha][coluna] != simbolo){
                    break;
                }
            }
        }

        return -1;
    }

    //Conta simbolos iguais na diagonal principal
    private int contaDiagonalPrincipal(char simbolo) {
        int conta_simbolos = 0;

        for (int i = 0, j = 0; i < 4; i++, j++){
            if (tabuleiro[i][j] == simbolo){
                conta_simbolos++;
            }
        }

        return conta_simbolos;
    }

    //Conta simbolos iguais na diagonal principal
    private int contaDiagonalReversa(char simbolo) {
        int conta_simbolos = 0;

        for (int i = 0, j = 3; i < 4; i++, j--){
            if (tabuleiro[i][j] == simbolo){
                conta_simbolos++;
            }
        }

        return conta_simbolos;
    }

    //Conta simbolos iguais na mesma linha
    private int contaLinha(int linha, char simbolo){

        int conta_simbolos = 0;

        for (int i = 0; i < 4; i++){
            if (tabuleiro[linha][i] == simbolo){
                conta_simbolos++;
            }
        }

        return conta_simbolos;
    }

    //Conta simbolos iguais na mesma coluna
    private int contaColuna(int coluna, char simbolo){
        int conta_simbolos = 0;

        for (int i = 0; i < 4; i++){
            if (tabuleiro[i][coluna] == simbolo){
                conta_simbolos++;
            }
        }

        return conta_simbolos;
    }
}

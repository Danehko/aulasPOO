package jogo;

import java.util.Random;

public class Computador {

    public int[][] posAleatorio(int[][] mat,Jogador jg){
        int d = 0;
        while(d==0) {
            Random r = new Random();
            int i = r.nextInt(8);
            int linha = i / 3;
            int coluna = i / 3;
            if(mat[linha][coluna]==0){
                mat[linha][coluna]= jg.getMarcador();
                d=1;
            }
        }
        return mat;
    }

    public int[][] inteligencia(int[][] mat,int valor){

    }

}

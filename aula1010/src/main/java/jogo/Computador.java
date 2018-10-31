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

    public boolean vencer(int[][] mat,Jogador jg){
        if((jogada1(mat)/jg.getMarcador())==2&&(jogada1(mat)%jg.getMarcador())==0){
            return true;
        }
        else if((jogada2(mat)/jg.getMarcador())==2&&(jogada2(mat)%jg.getMarcador())==0){
            return true;
        }
        else if((jogada3(mat)/jg.getMarcador())==2&&(jogada3(mat)%jg.getMarcador())==0){
            return true;
        }
        else if((jogada4(mat)/jg.getMarcador())==2&&(jogada4(mat)%jg.getMarcador())==0){
            return true;
        }
        else if((jogada5(mat)/jg.getMarcador())==2&&(jogada5(mat)%jg.getMarcador())==0){
            return true;
        }
        else if((jogada6(mat)/jg.getMarcador())==2&&(jogada6(mat)%jg.getMarcador())==0){
            return true;
        }
        else if((jogada7(mat)/jg.getMarcador())==2&&(jogada7(mat)%jg.getMarcador())==0){
            return true;
        }
        else if((jogada8(mat)/jg.getMarcador())==2&&(jogada8(mat)%jg.getMarcador())==0){
            return true;
        }
        return false;
    }

    public boolean perder(int[][] mat,Jogador jg){
        if((jogada1(mat)/jg.getMarcadorAdv())==2&&(jogada1(mat)%jg.getMarcadorAdv())==0){
            return true;
        }
        else if((jogada2(mat)/jg.getMarcadorAdv())==2&&(jogada2(mat)%jg.getMarcadorAdv())==0){
            return true;
        }
        else if((jogada3(mat)/jg.getMarcadorAdv())==2&&(jogada3(mat)%jg.getMarcadorAdv())==0){
            return true;
        }
        else if((jogada4(mat)/jg.getMarcadorAdv())==2&&(jogada4(mat)%jg.getMarcadorAdv())==0){
            return true;
        }
        else if((jogada5(mat)/jg.getMarcadorAdv())==2&&(jogada5(mat)%jg.getMarcadorAdv())==0){
            return true;
        }
        else if((jogada6(mat)/jg.getMarcadorAdv())==2&&(jogada6(mat)%jg.getMarcadorAdv())==0){
            return true;
        }
        else if((jogada7(mat)/jg.getMarcadorAdv())==2&&(jogada7(mat)%jg.getMarcadorAdv())==0){
            return true;
        }
        else if((jogada8(mat)/jg.getMarcadorAdv())==2&&(jogada8(mat)%jg.getMarcadorAdv())==0){
            return true;
        }
        return false;
    }

    public int jogada1(int[][] mat){
        int aux = mat[0][0]+ mat[0][1]+mat[0][2];
        return aux;
    }

    public int jogada2(int[][] mat){
        int aux = mat[1][0]+ mat[1][1]+mat[1][2];
        return aux;
    }

    public int jogada3(int[][] mat){
        int aux = mat[2][0]+ mat[2][1]+mat[2][2];
        return aux;
    }

    public int jogada4(int[][] mat){
        int aux = mat[0][0]+ mat[1][0]+mat[2][0];
        return aux;
    }

    public int jogada5(int[][] mat){
        int aux = mat[0][1]+ mat[1][1]+mat[2][1];
        return aux;
    }

    public int jogada6(int[][] mat){
        int aux = mat[0][2]+ mat[1][2]+mat[2][2];
        return aux;
    }

    public int jogada7(int[][] mat){
        int aux = mat[0][0]+ mat[1][1]+mat[2][2];
        return aux;
    }

    public int jogada8(int[][] mat){
        int aux = mat[2][0]+ mat[2][1]+mat[2][2];
        return aux;
    }

    public int[][] inteligencia(int[][] mat, Jogador jg){
        if(vencer(mat,jg)==true){

        }
        else if(perder(mat,jg)==true){

        }
    }
}






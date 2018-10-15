package jogo;

import java.sql.SQLOutput;

public class JogoDaVelha {
    private int [] [] mat;

    public void setMat(int aux1,int aux2,int aux3,int aux4,int aux5,int aux6,int aux7,int aux8,int aux9){
        this.mat[0][0]=aux1;
        this.mat[0][1]=aux2;
        this.mat[0][2]=aux3;
        this.mat[1][0]=aux4;
        this.mat[1][1]=aux5;
        this.mat[1][2]=aux6;
        this.mat[2][0]=aux7;
        this.mat[2][1]=aux8;
        this.mat[2][2]=aux9;
    }


    public boolean vencer(int valor){
        if((mat[0][0]==valor)&(mat[0][1]==valor)&(mat[0][2]==valor)){
            return true;
        }
        else if((mat[1][0]==valor)&(mat[1][1]==valor)&(mat[1][2]==valor)){
            return true;
        }
        else if((mat[2][0]==valor)&(mat[2][1]==valor)&(mat[2][2]==valor)){
            return true;
        }
        else if((mat[0][0]==valor)&(mat[1][0]==valor)&(mat[2][0]==valor)){
            return true;
        }
        else if((mat[0][1]==valor)&(mat[1][1]==valor)&(mat[2][1]==valor)){
            return true;
        }
        else if((mat[0][2]==valor)&(mat[1][2]==valor)&(mat[2][2]==valor)){
            return true;
        }
        else if((mat[0][0]==valor)&(mat[1][1]==valor)&(mat[2][2]==valor)){
            return true;
        }
        else if((mat[0][2]==valor)&(mat[1][1]==valor)&(mat[2][0]==valor)){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean perder(int valor){
        valor = valor*-1;

        if((mat[0][0]==valor)&(mat[0][1]==valor)&(mat[0][2]==valor)){
            return true;
        }
        else if((mat[1][0]==valor)&(mat[1][1]==valor)&(mat[1][2]==valor)){
            return true;
        }
        else if((mat[2][0]==valor)&(mat[2][1]==valor)&(mat[2][2]==valor)){
            return true;
        }
        else if((mat[0][0]==valor)&(mat[1][0]==valor)&(mat[2][0]==valor)){
            return true;
        }
        else if((mat[0][1]==valor)&(mat[1][1]==valor)&(mat[2][1]==valor)){
            return true;
        }
        else if((mat[0][2]==valor)&(mat[1][2]==valor)&(mat[2][2]==valor)){
            return true;
        }
        else if((mat[0][0]==valor)&(mat[1][1]==valor)&(mat[2][2]==valor)){
            return true;
        }
        else if((mat[0][2]==valor)&(mat[1][1]==valor)&(mat[2][0]==valor)){
            return true;
        }
        else{
            return false;
        }
    }

}
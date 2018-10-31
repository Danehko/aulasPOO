package jogo;

import java.sql.SQLOutput;

public class JogoDaVelha {
    private int [] [] mat;
    private Jogador j1;
    private Jogador j2;

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

    public void set(int posl, int posc, Jogador j){
        this.mat[posl][posc]= j.getMarcador();
    }

    public boolean vencer(Jogador j){
        if((mat[0][0]+ mat[0][1]+mat[0][2])== 3*j.getMarcador()){
            return true;
        }
        else if((mat[1][0]+ mat[1][1]+mat[1][2])== 3*j.getMarcador()) {
            return true;
        }
        else if((mat[2][0]+ mat[2][1]+mat[2][2])== 3*j.getMarcador()){
            return true;
        }
        else if((mat[0][0]+ mat[1][0]+mat[2][0])== 3*j.getMarcador()){
            return true;
        }
        else if((mat[0][1]+ mat[1][1]+mat[2][1])== 3*j.getMarcador()){
            return true;
        }
        else if((mat[0][2]+ mat[1][2]+mat[2][2])== 3*j.getMarcador()){
            return true;
        }
        else if((mat[0][0]+ mat[1][1]+mat[2][2])== 3*j.getMarcador()){
            return true;
        }
        else if((mat[0][2]+ mat[1][1]+mat[2][0])== 3*j.getMarcador()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean perder(Jogador j){
        if((mat[0][0]+ mat[0][1]+mat[0][2])== -3*j.getMarcador()){
            return true;
        }
        else if((mat[1][0]+ mat[1][1]+mat[1][2])== -3*j.getMarcador()) {
            return true;
        }
        else if((mat[2][0]+ mat[2][1]+mat[2][2])== -3*j.getMarcador()){
            return true;
        }
        else if((mat[0][0]+ mat[1][0]+mat[2][0])== -3*j.getMarcador()){
            return true;
        }
        else if((mat[0][1]+ mat[1][1]+mat[2][1])== -3*j.getMarcador()){
            return true;
        }
        else if((mat[0][2]+ mat[1][2]+mat[2][2])== -3*j.getMarcador()){
            return true;
        }
        else if((mat[0][0]+ mat[1][1]+mat[2][2])== -3*j.getMarcador()){
            return true;
        }
        else if((mat[0][2]+ mat[1][1]+mat[2][0])== -3*j.getMarcador()){
            return true;
        }
        else{
            return false;
        }
    }

}
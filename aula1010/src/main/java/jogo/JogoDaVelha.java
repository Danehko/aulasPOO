package jogo;

import java.sql.SQLOutput;

public class JogoDaVelha {
    private final int espaco = 9;
    private int espacoocup;
    private final String traco = "\u2500\u2500\u2500\u253c\u2500\u2500\u2500\u253c\u2500\u2500\u2500";
    private String Linha11 = " \u2502 \u2502 ";
    private String linha1 = Linha11;
    private String linha2 = Linha11;
    private String linha3 = Linha11;
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

    public JogoDaVelha(int num){
        if(num == 2){
            Jogador jogador1= new Jogador(1,"human");
            Jogador jogador2= new Jogador(2,"human");
            this.mat = new int [3] [3];
        }else{
            Jogador jogador1= new Jogador(1,"human");
            Jogador jogador2= new Jogador(2,"computer");
            this.mat = new int [3] [3];
        }
    }

    public JogoDaVelha(){
        Jogador jogador1= new Jogador(1,"human");
        Jogador jogador2= new Jogador(2,"computer");
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

    public boolean Jogada(int linha, int coluna, int valor, String marcador){

        if (mat[linha][coluna] == 0) {
            mat[linha][coluna] = valor;
            if (linha == 0){
                if(coluna == 0){
                    this.linha1 = marcador+this.linha1;
                }
                else if(coluna == 1){
                    String[] result = this.linha1.split("\u2502");
                    this.linha1 = result[0]+"\u2502 "+marcador+" \u2502"+result[2];
                }
                else if(coluna == 2){
                    this.linha1 = this.linha1+marcador;
                }
                else{
                    return false;
                }
            }
            else if (linha == 1){
                if(coluna == 0){
                    this.linha2 = marcador+this.linha2;
                }
                else if(coluna == 1){
                    String[] result = this.linha2.split("\u2502");
                    this.linha2 = result[0]+"\u2502 "+marcador+" \u2502"+result[2];
                }
                else if(coluna == 2){
                    this.linha2 = this.linha2+marcador;
                }
                else{
                    return false;
                }
            }
            else if (linha == 2){
                if(coluna == 0){
                    this.linha3 = marcador+this.linha3;
                }
                else if(coluna == 1){
                    String[] result = this.linha3.split("\u2502");
                    this.linha3 = result[0]+"\u2502 "+marcador+" \u2502"+result[2];
                }
                else if(coluna == 2){
                    this.linha3 = this.linha3+marcador;
                }
                else{
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public void reset(){
        this.linha1 = this.Linha11;
        this.linha2 = this.Linha11;
        this.linha3 = this.Linha11;
    }

    public void mostraJogo(){
        System.out.println(linha1);
        System.out.println(traco);
        System.out.println(linha2);
        System.out.println(traco);
        System.out.println(linha3);
    }

    public void Jogada(int linha, int coluna, String jogador){
        posicao[linha][coluna] = jogador;
    }


}
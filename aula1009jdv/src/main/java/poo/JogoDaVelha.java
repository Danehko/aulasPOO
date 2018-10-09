package poo;

        import java.sql.SQLOutput;

public class JogoDaVelha {
    private final int espaco = 9;
    private int [] [] mat;
    private Jogador jogador1;
    private Jogador jogador2;

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
            Jogador jogador1 = new Jogador(1,"human");
            Jogador jogador2 = new Jogador(2,"human");
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
}
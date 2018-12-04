package jogo;

import java.util.Random;

public class Computador extends Jogador {
    private int cont = 0;
    private int marcador;
    private int marcadorAdv;
    private String nome;
    private String type;


    public Computador(int seq, String nome, String type) {
        super(seq, nome, type);
        this.type = type;
        this.nome = nome;
        if (seq == 1){
            this.marcador=3;
            this.marcadorAdv=7;
        }else if(seq == 2) {
            this.marcador=7;
            this.marcadorAdv=3;
        }else{
            System.out.println("ERRO!!!");
            this.nome = "";
            this.marcador = 0;
            this.marcadorAdv = 0;
        }
    }

    public int posAleatorio(int[][] mat){
        int d = 0;
        int resultado = 0;
        while(d==0) {
            Random r = new Random();
            int i = r.nextInt(8);
            int linha = i / 3;
            int coluna = i % 3;
            if(mat[linha][coluna]==0){
                resultado = (3*linha)+coluna;
                d=1;
            }
        }
        return resultado;
    }

    public int inteligencia(int[][] mat, int numJogadas){
        if(numJogadas==0){ //se iniciar começa sempre no meio
            return 4;
        }
        else if((numJogadas==1) && (mat[1][1]==this.getMarcadorAdv())){ //se não iniciar e o adv jogar no meio joga nas pontas
            Random r = new Random();
            int i = r.nextInt(3);
            if(i==0){
                return 0;
            }
            else if(i==1){
                return 2;
            }
            else if(i==2){
                return 6;
            }
            else{
                return 8;
            }
        }
        else if((numJogadas==1) && (mat[1][1]==0)){ // se não iniciar e o adv não jogar no meio é lá q eu jogo
            return 4;
        }
        else if((numJogadas==2)){ // se for minha segunda rodada preferencia na ponta, sempre a ponta vizinha q ele jogou
            if(mat[0][0]!=0){
                Random r = new Random();
                int i = r.nextInt(1);
                if (i == 0) {
                    return 2;
                }
                else{
                    return 6;
                }
            }
            else if(mat[0][2]!=0){
                Random r = new Random();
                int i = r.nextInt(1);
                if (i == 0) {
                    return 0;
                }
                else{
                    return 8;
                }
            }
            else if(mat[2][0]!=0){
                Random r = new Random();
                int i = r.nextInt(1);
                if (i == 0) {
                    return 0;
                }
                else{
                    return 8;
                }
            }
            else if(mat[2][2]!=0){
                Random r = new Random();
                int i = r.nextInt(1);
                if (i == 0) {
                    return 2;
                }
                else{
                    return 6;
                }
            }
            else if(mat[0][1]!=0){
                Random r = new Random();
                int i = r.nextInt(1);
                if (i == 0) {
                    return 0;
                }
                else{
                    return 2;
                }
            }
            else if(mat[1][0]!=0){
                Random r = new Random();
                int i = r.nextInt(1);
                if (i == 0) {
                    return 0;
                }
                else{
                    return 6;
                }
            }
            else if(mat[1][2]!=0){
                Random r = new Random();
                int i = r.nextInt(1);
                if (i == 0) {
                    return 2;
                }
                else{
                    return 8;
                }
            }
            else{
                Random r = new Random();
                int i = r.nextInt(1);
                if (i == 0) {
                    return 6;
                }
                else{
                    return 8;
                }
            }
        }
        else if((numJogadas==3)){
            if(possoPerder(mat)!=9){
                return possoPerder(mat);
            }
            else if(((mat[0][1])+(mat[2][1])){
                Random r = new Random();
                int i = r.nextInt(1);
                if (i == 0) {
                    return 1;
                } else {
                    return 7;
                }
            }
            else{
                return posAleatorio(mat);
            }
        }
        else if((numJogadas==4)){

        }
        else if((numJogadas==5)){

        }
        else if((numJogadas==6)){

        }
        else if((numJogadas==7)){

        }
        else{
            if(mat[0][0]==0){
                return 0;
            }
            if(mat[0][1]==0){
                return 1;
            }
            if(mat[0][2]==0){
                return 2;
            }
            if(mat[1][0]==0){
                return 3;
            }
            if(mat[1][2]==0){
                return 5;
            }
            if(mat[2][0]==0){
                return 6;
            }
            if(mat[2][1]==0){
                return 7;
            }
            else{
                return 8;
            }
        }
    }

    public boolean jogada(int pos){
        int linha = pos / 3;
        int coluna = pos % 3;
        if(mat[linha][coluna]==0){
            mat[linha][coluna]= this.getMarcador();
            return true;
        }
        return false;
    }

    public int possoVencer(int[][] mat){
        if((mat[0][0]+ mat[0][1]+mat[0][2])== 2*this.getMarcador()){
            if(mat[0][0]==0){
                return 0;
            }
            else if(mat[0][1]==0){
                return 1;
            }
            else{
                return 2;
            }
        }
        else if((mat[1][0]+ mat[1][1]+mat[1][2])== 2*this.getMarcador()) {
            if(mat[1][0]==0){
                return 3;
            }
            else if(mat[1][1]==0){
                return 4;
            }
            else{
                return 5;
            }
        }
        else if((mat[2][0]+ mat[2][1]+mat[2][2])== 2*this.getMarcador()){
            if(mat[2][0]==0){
                return 6;
            }
            else if(mat[2][1]==0){
                return 7;
            }
            else{
                return 8;
            }
        }
        else if((mat[0][0]+ mat[1][0]+mat[2][0])== 2*this.getMarcador()){
            if(mat[0][0]==0){
                return 0;
            }
            else if(mat[1][0]==0){
                return 3;
            }
            else{
                return 6;
            }
        }
        else if((mat[0][1]+ mat[1][1]+mat[2][1])== 2*this.getMarcador()){
            if(mat[0][1]==0){
                return 1;
            }
            else if(mat[1][1]==0){
                return 4;
            }
            else{
                return 7;
            }
        }
        else if((mat[0][2]+ mat[1][2]+mat[2][2])== 2*this.getMarcador()){
            if(mat[0][2]==0){
                return 2;
            }
            else if(mat[0][2]==0){
                return 5;
            }
            else{
                return 8;
            }
        }
        else if((mat[0][0]+ mat[1][1]+mat[2][2])== 2*this.getMarcador()){
            if(mat[0][0]==0){
                return 0;
            }
            else if(mat[1][1]==0){
                return 4;
            }
            else{
                return 8;
            }
        }
        else if((mat[0][2]+ mat[1][1]+mat[2][0])== 2*this.getMarcador()){
            if(mat[0][2]==0){
                return 2;
            }
            else if(mat[4][1]==0){
                return 4;
            }
            else{
                return 8;
            }
        }
        else{
            return 9;
        }
    }

    public int possoPerder(int[][] mat){
        if((mat[0][0]+ mat[0][1]+mat[0][2])== 2*this.getMarcadorAdv()){
            if(mat[0][0]==0){
                return 0;
            }
            else if(mat[0][1]==0){
                return 1;
            }
            else{
                return 2;
            }
        }
        else if((mat[1][0]+ mat[1][1]+mat[1][2])== 2*this.getMarcadorAdv()) {
            if(mat[1][0]==0){
                return 3;
            }
            else if(mat[1][1]==0){
                return 4;
            }
            else{
                return 5;
            }
        }
        else if((mat[2][0]+ mat[2][1]+mat[2][2])== 2*this.getMarcadorAdv()){
            if(mat[2][0]==0){
                return 6;
            }
            else if(mat[2][1]==0){
                return 7;
            }
            else{
                return 8;
            }
        }
        else if((mat[0][0]+ mat[1][0]+mat[2][0])== 2*this.getMarcadorAdv()){
            if(mat[0][0]==0){
                return 0;
            }
            else if(mat[1][0]==0){
                return 3;
            }
            else{
                return 6;
            }
        }
        else if((mat[0][1]+ mat[1][1]+mat[2][1])== 2*this.getMarcadorAdv()){
            if(mat[0][1]==0){
                return 1;
            }
            else if(mat[1][1]==0){
                return 4;
            }
            else{
                return 7;
            }
        }
        else if((mat[0][2]+ mat[1][2]+mat[2][2])== 2*this.getMarcadorAdv()){
            if(mat[0][2]==0){
                return 2;
            }
            else if(mat[0][2]==0){
                return 5;
            }
            else{
                return 8;
            }
        }
        else if((mat[0][0]+ mat[1][1]+mat[2][2])== 2*this.getMarcadorAdv()){
            if(mat[0][0]==0){
                return 0;
            }
            else if(mat[1][1]==0){
                return 4;
            }
            else{
                return 8;
            }
        }
        else if((mat[0][2]+ mat[1][1]+mat[2][0])== 2*this.getMarcadorAdv()){
            if(mat[0][2]==0){
                return 2;
            }
            else if(mat[4][1]==0){
                return 4;
            }
            else{
                return 8;
            }
        }
        else{
            return 9;
        }
    }
}






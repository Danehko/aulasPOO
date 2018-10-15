package jogo;

public class Jogador {
    private int marcador;
    private String nome;

    public Jogador(int seq,String nome) {
        this.nome = nome;
        if (seq == 1){
            this.marcador=1;
        }else if(seq == 2) {
            this.marcador=-1;
        }else{
            System.out.println("ERRO!!!");
            this.nome = "";
            this.marcador = 0;
        }
    }
}
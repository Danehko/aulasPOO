package jogo;

public class Jogador {
    private int marcador;
    private int marcadorAdv;
    private String nome;
    private String type;

    public Jogador(int seq, String nome, String type) {
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

    public String getType() {
        return type;
    }

    public int getMarcador() {
        return marcador;
    }

    public int getMarcadorAdv() {
        return marcadorAdv;
    }

    public String getNome() {
        return nome;
    }
}
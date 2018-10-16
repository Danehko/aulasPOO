package jogo;

public class Jogador {
    private int marcador;
    private String nome;
    private String type;

    public Jogador(int seq,String nome, String type) {
        this.type = type;
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

    public String getType() {
        return type;
    }

    public int getMarcador() {
        return marcador;
    }

    public String getNome() {
        return nome;
    }
}
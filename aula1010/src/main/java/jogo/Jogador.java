package jogo;

public class Jogador {
    private String marcador;
    private int nMarcador;
    private String player;
    private int valor;

    public boolean Jogador(int seq, String player) {
        this.player = player;
        if (seq == 1){
            this.marcador="X";
            this.nMarcador=1;
            return true;
        }else if(seq == 2) {
            this.marcador="O";
            this.nMarcador=-1;
            return true;
        }else{
            return false;
        }
    }
}
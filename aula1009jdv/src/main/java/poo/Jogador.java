package poo;

public class Jogador {
    private int marcador;
    private String player;
    private int valor;

    public Jogador(int seq, String player) {
        this.player = player;
        if (seq == 1){
            this.marcador=1;
        }else if(seq == 2) {
            this.marcador=-1;
        }
    }
}

package poo;

public class Soldado {
    private static int numsoldado;
    private int pos;
    private final String ARMA1 = "fuzil";
    private final String ARMA2 = "baioneta";
    private final String ARMA3 = "punho";
    private final int padrao=10;

    public Soldado() {
        numsoldado++;
    }

    public void deslocar(){
        this.deslocar(padrao);
    }

    public void deslocar(int pos){
        this.pos = this.pos + pos;
    }

    public void atacar(){
        this.atacar(ARMA1);
    }

    public void atacar(String aux){
        if(!aux.equals(ARMA1) && !aux.equals(ARMA2) && !aux.equals(ARMA3) ){
            aux = ARMA1;
        }

        if(numsoldado >=10){
            System.out.println("Atacando com " + aux);
        }
        else{
            System.out.println("Recuar");
        }
    }

    public static int getNumsoldado() {
        return numsoldado;
    }

    public int getPos() {
        return pos;
    }
}
package poo;

public class contador {
    private int valorAtual;

    public void incrementarValor(){
        valorAtual = valorAtual + 1;
    }

    public int mostrarValor(){
        return valorAtual;
    }

    public void atibuirValor(int numero){
        if(numero<0){
            valorAtual=0;
        }else valorAtual = numero;
    }
}

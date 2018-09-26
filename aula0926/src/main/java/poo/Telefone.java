package poo;

public class Telefone {
    private int codigo;
    private String numSerie, modelo;
    private double peso;
    private Dimensao dim;


    public Telefone (int c, String s, String m, double p , Dimensao d){
        this.codigo = c;
        this.numSerie = s;
        this.modelo = m;
        this.peso = p;
        this.dim = d;
    }

    public void imprimirDados(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Número de Série: " + this.numSerie);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Peso: " + this.peso);
        this.dim.imprimirDAdos();
    }

    public void ola(){
        System.out.println("Ola");
    }
}

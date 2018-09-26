package poo;

public class Dimensao {
    double altura;
    double largura;
    double profundidade;

    public Dimensao(double a, double l, double p){
        this.altura = a;
        this.largura = l;
        this.profundidade = p;
    }

    public void imprimirDAdos(){
        System.out.println("Altura: " + this.altura);
        System.out.println("Largura: " + this.largura);
        System.out.println("Profundidade: " + this.profundidade);
    }
}

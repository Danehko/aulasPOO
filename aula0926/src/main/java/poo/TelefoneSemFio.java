package poo;

public class TelefoneSemFio extends Telefone{
    private double frequencia, distancia;
    private int canais;

    public TelefoneSemFio(int c, String s, String m, double p , Dimensao d, double f, double dis, int ca){
        super(c,s,m,p,d);
        this.frequencia = f;
        this.distancia = dis;
        this.canais = ca;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Frequência: " + this.frequencia);
        System.out.println("Distancia: " + this.distancia);
        System.out.println("Canais: " + this.canais);
    }
}

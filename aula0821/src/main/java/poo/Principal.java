package poo;

public class Principal {
    public static void main(String[] args) {
        contador c = new contador();
        contador d = new contador();

        c.atibuirValor(0);
        d.atibuirValor(0);

        System.out.println(c.mostrarValor());
        System.out.println(d.mostrarValor());

        c.incrementarValor();
        c.incrementarValor();
        c.incrementarValor();

        System.out.println(c.mostrarValor());
        System.out.println(d.mostrarValor());
    }
}

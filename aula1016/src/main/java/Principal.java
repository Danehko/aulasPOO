/*exemplo1
public class Principal {
    public static void main(String[] args) {
        Fluxo1 f1 = new Fluxo1();
        Fluxo2 f2 = new Fluxo2();
        f1.disparar();
        f2.disparar();
        System.err.println();
    }
}
*/
public class Principal {
    public static void main(String[] args) {
        Thread comHerança = new Fluxo1();
        Thread f2 = new Fluxo2();
        f1.disparar();
        f2.disparar();
        System.err.println();
    }
}
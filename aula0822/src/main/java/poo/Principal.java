package poo;

public class Principal {
    public static void main(String[] args) {
        Tempo t1 = new Tempo();
        Tempo t2 = new Tempo(24);
        Tempo t3 = new Tempo(2, 90);
        Tempo t4 = new Tempo(1, 10,5);

        String hora = t4.toString();
        System.out.println("O contador 4 está maarcando: " + hora);

        boolean bl1 = t1.setHora(20);
        System.out.println(bl1);

        long teste = t4.temposeg();
        System.out.println("total de segundos do contador 4: " + teste);
    }
}

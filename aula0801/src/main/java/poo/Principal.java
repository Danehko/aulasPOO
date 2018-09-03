package poo;

public class Principal {
    public static void main(String[] args) {
        Secundaria s = new Secundaria();
        s.Soma();

        Encontrar e = new Encontrar();
        e.zeroADez();
        e.zeroACem();

        Matricula m = new Matricula();
        m.verificarmatricula(1420012320);
        m.criaMatricula();
    }
}

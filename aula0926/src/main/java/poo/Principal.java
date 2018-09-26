package poo;

public class Principal {
    public static void main(String[] args) {
        Dimensao dim1 = new Dimensao(11/2, 5 ,2 );

        Telefone comfio = new Telefone(123456,"1234567jg", "model456", 2, dim1);

        Dimensao dim2 = new Dimensao(12,6,3);
        TelefoneSemFio semfio = new TelefoneSemFio(123457,"1234557jg", "model256", 1, dim2, 1200, 100, 12);

        comfio.ola();
        semfio.ola();
    }
}

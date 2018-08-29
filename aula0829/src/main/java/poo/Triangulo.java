package poo;

public class Triangulo {

    public String tipoTriangulo(int a, int b, int c){

        if(((Math.abs(b-c)<a) && ((b+c)>a))&&((Math.abs(a-c)<b) && ((a+c)>b))&&((Math.abs(b-a)<c) && ((b+a)>c))){
            return "não é um triângulo";
        }
        else if((a==b) && (b==c)){
            return "é um triangulo equilatero";
        }
        else if((a==b)||(a==c)||(b==c)){
            return "é um triangulo isosceles";
        }
        else{
            return "é um triangulo escaleno";
        }

    }
}

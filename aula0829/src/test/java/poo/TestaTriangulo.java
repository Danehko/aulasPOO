package poo;

import org.junit.Assert;
import org.junit.Test;

public class TestaTriangulo {

    @Test
    public void TestaTriangulo(){
        Triangulo triangulo = new Triangulo();

        Assert.assertEquals("10x1x2 não é um triângulo", "não é um triângulo", triangulo.tipoTriangulo(10,1,2));
        Assert.assertEquals("10x2x1 não é um triângulo", "não é um triângulo", triangulo.tipoTriangulo(10,2,1));
        Assert.assertEquals("1x10x2 não é um triângulo", "não é um triângulo", triangulo.tipoTriangulo(1,10,2));
        Assert.assertEquals("2x10x1 não é um triângulo", "não é um triângulo", triangulo.tipoTriangulo(2,10,1));
        Assert.assertEquals("1x2x10 não é um triângulo", "não é um triângulo", triangulo.tipoTriangulo(1,2,10));
        Assert.assertEquals("2x1x10 não é um triângulo", "não é um triângulo", triangulo.tipoTriangulo(2,1,10));
        Assert.assertEquals("4x4x4 é um triângulo equilatero", "é um triangulo equilatero", triangulo.tipoTriangulo(4,4,4));
        Assert.assertEquals("4x4x6 é um triângulo isosceles", "é um triangulo isosceles", triangulo.tipoTriangulo(4,4,6));
        Assert.assertEquals("4x6x4 é um triângulo isosceles", "é um triangulo isosceles", triangulo.tipoTriangulo(4,6,4));
        Assert.assertEquals("6x4x4 é um triângulo isosceles", "é um triangulo isosceles", triangulo.tipoTriangulo(6,4,4));
        Assert.assertEquals("3x4x5 é um triângulo escaleno", "é um triangulo escaleno", triangulo.tipoTriangulo(3,4,5));
        Assert.assertEquals("3x5x4 é um triângulo escaleno", "é um triangulo escaleno", triangulo.tipoTriangulo(3,5,4));
        Assert.assertEquals("4x3x5 é um triângulo escaleno", "é um triangulo escaleno", triangulo.tipoTriangulo(4,3,5));
        Assert.assertEquals("5x3x4 é um triângulo escaleno", "é um triangulo escaleno", triangulo.tipoTriangulo(5,3,4));
        Assert.assertEquals("4x5x3 é um triângulo escaleno", "é um triangulo escaleno", triangulo.tipoTriangulo(5,4,3));
        Assert.assertEquals("5x4x3 é um triângulo escaleno", "é um triangulo escaleno", triangulo.tipoTriangulo(4,5,3));
    }
}


package poo.aritmetica.prueba;

import poo.aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmética ***");
        var aritmetica1 = new Aritmetica();

        aritmetica1.setOperando1(5);
        aritmetica1.setOperando2(7);
        System.out.println();
        aritmetica1.sumar();
        aritmetica1.restar();
        var aritmetica2= new Aritmetica();
        aritmetica2.setOperando1(15);
        aritmetica2.setOperando2(16);
        System.out.println();
        aritmetica2.sumar();
        aritmetica2.restar();
    }
}

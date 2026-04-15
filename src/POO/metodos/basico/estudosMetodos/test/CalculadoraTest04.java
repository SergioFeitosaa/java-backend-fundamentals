package POO.metodos.basico.estudosMetodos.test;

import POO.metodos.basico.estudosMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero1 = 1;
        int numero2 = 2;

        calculadora.alteraDoisNumeros(numero1, numero2);
        System.out.println("Dentro Calculadora");
        System.out.println(numero1);
        System.out.println(numero2);
    }
}

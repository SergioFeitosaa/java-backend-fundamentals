package POO.metodos.basico.estudosMetodos;

public class Soma {
    int somaMaisDez(int numero) {
        return numero + 10;
    }

    public static void main(String[] args) {
        Soma soma = new Soma();

        int resultado = soma.somaMaisDez(5);
        System.out.println("Resultado: " + resultado);
    }
}

package logicaProgramacao.D_array;

public class Ex_04 {
    //for-each
    public static void main(String[] args) {
        String[] nomes = {"Sérgio", "Fernanda", "Mariana"};

        for (String nome : nomes) {
            System.out.println(nome);
        }
//        Use for-each para:
//        1️⃣ Mostrar todos os números
//        2️⃣ Somar os números
//        3️⃣ Mostrar apenas os pares

        int[] numeros = {10, 20, 30, 40, 50, 7};
        int soma = 0;

        for (int numero : numeros) {
            System.out.println("Números do array: " + numero);
            soma += numero;
        }
        System.out.println("Soma dos números: " + soma);

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            }
        }

    }
}

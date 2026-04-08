package logicaProgramacao.D_array;

public class Ex_03 {
    public static void main(String[] args) {
//        1️⃣ Criar um array com alguns números
//        2️⃣ Percorrer o array com for
//        3️⃣ Somar todos os valores
//        4️⃣ Mostrar o resultado final

        int soma = 0;

        int[] numeros = {2, 4, 6, 8, 10};
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("Resultado total: " + soma);

        //Mostre apenas os números pares dentro do array.

        int[] numeros2 = {3, 8, 15, 22, 7, 10, 30, 24, 20, 12};
        for (int i = 0; i < numeros2.length; i++) {
            if (numeros2[i] % 2 == 0) {
                System.out.println("Número pares: " + numeros2[i]);
            }
        }
//        Encontre o maior número dentro do array:
        int maior = numeros[0];

        int[] numero3 = {12, 7, 25, 3, 40, 18, 50};
        for (int i = 0; i < numero3.length; i++) {
            if (numero3[i] > maior) {
                maior = numero3[i];
            }
        }
        System.out.println("Maior número: " + maior);

    }


}

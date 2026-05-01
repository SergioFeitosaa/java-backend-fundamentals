package excecoes;

public class Ex_02 {
    public static void main(String[] args) {
        //Exercicio 2
        // Qual exceção? - ArrayIndexOutOfBoundsException
        //Compila? - sim
        //Quando quebra? - linha 12 - Runtime
        try {
            int[] numeros = new int[3];

            System.out.println(numeros[5]);

        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Erro array index 5 não existe");
        }

    }
}

package POO.metodos.intermediario;

public class Ex_06 {
// Crie um método que:
// Recebe um número
// Se for maior que 10 → retorna "Maior que 10"
// Senão → retorna "Menor ou igual a 10"
    String maiorQueDez(int numero) {
        if (numero > 10) {
            return "Maior que 10";
        } else {
            return "Menor ou igual a 10";
        }
    }

    public static void main(String[] args) {
        Ex_06 metodo = new Ex_06();

        String resultado = metodo.maiorQueDez(20);
        System.out.printf("Resultado: %s", resultado);
    }

}

package POO.metodos.intermediario;

public class Ex_07 {
//    Crie um método que:
//    👉 Recebe: um nome (String), uma idade (int)
//    👉 Regra:
//    Se idade >= 18 → "João é maior de idade"
//    Senão → "João é menor de idade"

    String verificadorMaiorDeIdade(String nome, int idade) {
        if (idade >= 18) {
            return nome + " é maior de idade";
        }else {
            return nome + " é menor de idade";
        }

    }

    public static void main(String[] args) {
        Ex_07 idade = new Ex_07();

        String resultado = idade.verificadorMaiorDeIdade("João", 20);
        System.out.println(resultado);
    }
}

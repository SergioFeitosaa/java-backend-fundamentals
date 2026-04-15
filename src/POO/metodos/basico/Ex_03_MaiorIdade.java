package POO.metodos.basico;

public class Ex_03_MaiorIdade {
//    Exercício 3 — Verificar Maior de Idade
//    Crie um método que:
//    Recebe uma idade (int)
//    Retorna true se for maior ou igual a 18, Caso contrário, retorna false

    public boolean maiorIdade (int idade){
        return idade >= 18;
    }

    public static void main(String[] args) {
        Ex_03_MaiorIdade pessoa = new Ex_03_MaiorIdade();

        boolean resultado = pessoa.maiorIdade(14);
        System.out.println(resultado);

    }

}

package logicaProgramacao.A_variavesTiposPrimitivos;

// Você está desenvolvendo um aplicativo que calcula a média de notas dos alunos.
// Para isso, você precisa armazenar as notas em variáveis do tipo double.
// Você decide criar três variáveis chamadas nota1, nota2 e nota3, e atribuir a elas os valores 7.5, 8.0 e 9.0, respectivamente e em seguida,
//calcular a média e exibi-la na tela.

public class Ex_03 {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + media);

    }
}

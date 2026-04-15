package POO.metodos.intermediario;

public class Ex_08 {
//    Método chamando método
//    Crie DOIS métodos:

    boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    String mensagem(String nome, int idade) {
        if (ehMaiorDeIdade(idade)) {
            return nome + " é maior de idade";
        }else {
            return nome + " é menor de idade";
        }
    }

    public static void main(String[] args) {
        Ex_08 pessoa = new Ex_08();
        String resultado = pessoa.mensagem("Carlos", 20);
        System.out.println(resultado);
    }
}

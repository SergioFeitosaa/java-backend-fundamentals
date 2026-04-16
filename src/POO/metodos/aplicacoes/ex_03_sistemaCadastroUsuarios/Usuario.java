package POO.metodos.aplicacoes.ex_03_sistemaCadastroUsuarios;

public class Usuario {
    String nome;
    int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String apresentar (){
        return nome + " tem " + idade + " anos";
    }
}

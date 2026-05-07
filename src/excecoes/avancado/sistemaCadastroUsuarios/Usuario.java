package excecoes.avancado.sistemaCadastroUsuarios;

//MINI PROJETO — Sistema de Cadastro de Usuários
//Criar um sistema que: cadastra usuários, valida dados, usa exceções personalizadas
//armazena em lista (List)
//funciona com menu (loop)

public class Usuario {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

package lambdaStream.advanced.Ex_01;

public class UsuarioDTO {
    private String nome;
    private int idade;

    public UsuarioDTO(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

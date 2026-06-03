package lambdaStream.predicate.fIlter;

import java.util.List;

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

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ana", 25);
        Usuario usuario2 = new Usuario("Amanda", 16);
        Usuario usuario3 = new Usuario("Carlos", 30);
        Usuario usuario4 = new Usuario("André", 19);

        List<Usuario> usuarioMaiorDeIdade =
                List.of(usuario1, usuario2, usuario3, usuario4)
                        .stream()
                        .filter(usuario -> usuario.getIdade() >= 18)
                        .toList();

        System.out.println("Maior idade: " + usuarioMaiorDeIdade);
    }
}

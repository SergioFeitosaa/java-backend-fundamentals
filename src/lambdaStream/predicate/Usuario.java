package lambdaStream.predicate;

import java.util.function.Predicate;

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

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ana", 25);
        Usuario usuario2 = new Usuario("Amanda", 16);
        Usuario usuario3 = new Usuario("Carlos", 30);
        Usuario usuario4 = new Usuario("André", 19);

        Predicate <Usuario> nomeComAEMaiorDeIdade= usuario -> usuario.getNome().startsWith("A") || usuario.getIdade() > 18;

        System.out.println(nomeComAEMaiorDeIdade.test(usuario1));
        System.out.println(nomeComAEMaiorDeIdade.test(usuario2));
        System.out.println(nomeComAEMaiorDeIdade.test(usuario3));
        System.out.println(nomeComAEMaiorDeIdade.test(usuario4));
    }
}

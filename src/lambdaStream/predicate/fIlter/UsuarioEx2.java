package lambdaStream.predicate.fIlter;

import java.util.List;
//Objetivo:
//Criar uma nova lista contendo apenas:
//usuários com nome começando com "A" E idade maior que 18

public class UsuarioEx2 {

    private String nome;
    private int idade;

    public UsuarioEx2(String nome, int idade) {
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
        return "UsuariosComA{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        UsuarioEx2 usuario1 = new UsuarioEx2("Ana", 25);
        UsuarioEx2 usuario2 = new UsuarioEx2("Amanda", 16);
        UsuarioEx2 usuario3 = new UsuarioEx2("Carlos", 30);
        UsuarioEx2 usuario4 = new UsuarioEx2("André", 19);

        List<UsuarioEx2> usuariosComAeMaiorDeIdade =
                List.of(usuario1, usuario2, usuario3, usuario4).
                        stream()
                        .filter(usuario ->
                                usuario.getNome().startsWith("A")
                                && usuario.getIdade() > 18)
                        .toList();

        System.out.println(usuariosComAeMaiorDeIdade);
    }


}


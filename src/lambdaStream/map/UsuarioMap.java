package lambdaStream.map;

import java.util.List;

public class UsuarioMap {
    private String nome;
    private int idade;

    public UsuarioMap(String nome, int idade) {
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
        return "UsuarioMap{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        UsuarioMap usuario1 = new UsuarioMap("Ana", 25);
        UsuarioMap usuario2 = new UsuarioMap("Carlos", 30);
        UsuarioMap usuario3 = new UsuarioMap("André", 19);

        List<UsuarioMap> usuarios = List.of(usuario1, usuario2, usuario3);

        List<String> nomes =
                usuarios.stream()
                        .map(UsuarioMap::getNome)
                        .toList();

        System.out.println(nomes);
    }
}

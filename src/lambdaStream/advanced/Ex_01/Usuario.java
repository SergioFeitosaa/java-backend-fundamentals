package lambdaStream.advanced.Ex_01;

import java.util.List;

public class Usuario {

    private String nome;
    private int idade;
    private String cpf;
    private String senha;

    public Usuario(String nome, int idade, String cpf, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Alejandro Zambra", 40, "00000000", "O poeta chileno");
        Usuario usuario2 = new Usuario("Ana", 25, "11111111", "senha123");
        Usuario usuario3 = new Usuario("Carlos", 30, "22222222", "java123");

        List<Usuario> cliente = List.of(usuario1, usuario2, usuario3);
        List<UsuarioDTO> usuarioDTO =
                cliente.stream()
                        .map(usuario -> new UsuarioDTO(usuario.getNome(), usuario.getIdade()))
                        .toList();

        System.out.println(usuarioDTO);

    }
}

package optional;

import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private Boolean admin;

    public Usuario(String nome, String email, Boolean admin) {
        this.nome = nome;
        this.email = email;
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Carlos", "carlos@email.com", false);
        Usuario usuario2 = new Usuario("Ana", "ana@email.com", true);
        Usuario usuario3 = new Usuario("João", "joao@email.com", false);

        List<Usuario> usuarios = List.of(usuario1, usuario2, usuario3);
        String primeiroUsuario = usuarios.stream()
                .filter(Usuario::getAdmin)
                .map(Usuario::getEmail)
                .findFirst()
                .orElse("Nenhum admin encontrado");
        System.out.println(primeiroUsuario);
    }
}

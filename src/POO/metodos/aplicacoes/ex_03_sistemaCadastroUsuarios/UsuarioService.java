package POO.metodos.aplicacoes.ex_03_sistemaCadastroUsuarios;

import java.util.ArrayList;

public class UsuarioService {

    ArrayList<Usuario> usuarios = new ArrayList<>();


    void cadastrarUsuario(String nome, int idade) {
        Usuario usuario = new Usuario(nome, idade);
        usuarios.add(usuario);
    }

    void listarUsuarios() {
        for (Usuario listaCadastro : usuarios) {
            System.out.println("Usuário cadastrado: " + listaCadastro.apresentar());
        }

    }
}

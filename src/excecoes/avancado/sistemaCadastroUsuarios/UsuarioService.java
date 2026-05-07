package excecoes.avancado.sistemaCadastroUsuarios;

import excecoes.avancado.sistemaCadastroUsuarios.exception.IdadeInvalidaException;
import excecoes.avancado.sistemaCadastroUsuarios.exception.NomeIvalidoException;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(String nome, int idade) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new NomeIvalidoException("Nome não pode ser vazio");
        }

        if (nome.length() < 3) {
            throw new NomeIvalidoException("Nome deve ter no mínimo 3 caracteres");
        }

        // 🔹 validação da idade
        if (idade < 0) {
            throw new IdadeInvalidaException("Idade não pode ser negativa");
        }

        if (idade < 18) {
            throw new IdadeInvalidaException("Usuário deve ser maior de 18 anos");
        }
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return new ArrayList<>(usuarios);
    }
}

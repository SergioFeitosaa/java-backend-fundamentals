package POO.metodos.aplicacoes.ex_02_miniSistema;

public class LoginService {
//    Simular um sistema backend básico com:
//    login ✔️
//    validação ✔️
//    compra ✔️

    boolean usuarioValido(String usuario) {
        return usuario.equals("admin");
    }

    boolean senhaValida(String senha) {
        return senha.equals("1234");
    }

    String login(String usuario, String senha) {

        if (!usuarioValido(usuario)) {
            return "Usuário inválido";
        } else if (!senhaValida(senha)) {
            return "Senha inválida";
        } else {
            return "Login realizado";
        }
    }
}

package POO.metodos.intermediario;

public class Ex_10 {

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

    public static void main(String[] args) {
        Ex_10 sistema = new Ex_10();

        String dados = sistema.login("admin", "123456");
        System.out.println(dados);
    }
}
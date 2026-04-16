package POO.metodos.aplicacoes.ex_03_sistemaCadastroUsuarios;

public class Main {
    public static void main(String[] args) {
        UsuarioService service = new UsuarioService();
        service.cadastrarUsuario("João" , 20);
        service.cadastrarUsuario("Maria", 17);
        service.cadastrarUsuario("Carlos", 30);

        service.listarUsuarios();
    }

}

package POO.metodos.basico;

public class Ex_05 {
//    Exercício 5 — Validação de Login (SITUAÇÃO REAL 🔥)
//    Crie um método que:
//    Recebe:  String usuario, String senha
//    Regra:
//    Se usuario = "admin" e senha = "1234" → retorna true
//    Caso contrário → false

    public boolean login(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }

    public static void main(String[] args) {
        Ex_05 sistema = new Ex_05();

        boolean resultado = sistema.login("user", "124");

        System.out.println("Senha verdadeira? " + resultado);
    }
}

package POO.metodos.aplicacoes.ex_02_miniSistema;

public class Main {
    public static void main(String[] args) {
        LoginService login = new LoginService();

        String resultado = login.login("admin", "1234");
        System.out.println(resultado + " pode comprar");

        CompraService compra = new CompraService();

        String resultado2 = compra.realizarCompra("João", 20, 50);
        System.out.println(resultado2 + " erro");
    }


}


package POO.metodos;

public class Ex_01_Saudacao {
    public String saudacao (String nome) {
        return "Olá " + nome + "! Seja bem-vindo ao sistema."  ;
    }

    public static void main(String[] args) {
        Ex_01_Saudacao nome = new Ex_01_Saudacao();
        String mensagem = nome.saudacao("João");

        System.out.println(mensagem);
    }
}

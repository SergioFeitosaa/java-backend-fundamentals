package excecoes;

public class Ex_01 {
    // Exercicio 1 - Compila ou não? - Sim
    //Vai dar erro em qual momento? - Quebra em runtime
    //Qual exceção aparece? - NullpointerException
    // Tratamento da excecao com o bloco Try / Catch

    public static void main(String[] args) {
        try {
            String nome = null;
            System.out.println(nome.length());
        } catch (NullPointerException e) {
            System.out.println("Erro na string nome");
        }
    }

}

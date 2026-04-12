package POO.metodos;

public class EstudosMetodos {
    //Função (Método) - bloco de código que realiza uma tarefa específica,
    // que pode ser reutilizado em diferentes partes do programa.
    //Se refere a funções associadas a uma classe ou objeto.

    // COMO NOMEAR MÉTODOS: De forma clara e descritiva importante para legibilidade do código.
    //Usar verbos que descrevem a ação do método (Calcular, obter, exibir)

    //TIPOS DE RETORNO

    //Se o método não retornar nenhum valor usamos void.

    String nome;

    public void imprime () {
        System.out.println("Meu nome: " + nome);
    }

    //o retorno define o tipo de dado que o método devolverar (int, String, double, Objeto)

     public int somar () {
         return 10 + 20;
     }

     //METODO COM PARÂMENTROS - Parametros são variaves que passamos para o método.

    public void mudarNome (String novoNome){
        nome = novoNome;
    }

}

package POO.metodos.basico.estudosMetodos.dominio;

public class Calculadora {
    //Função (Método) - bloco de código que realiza uma tarefa específica,
    // que pode ser reutilizado em diferentes partes do programa.
    //Se refere a funções associadas a uma classe ou objeto.

    // COMO NOMEAR MÉTODOS: De forma clara e descritiva importante para legibilidade do código.
    //Usar verbos que descrevem a ação do método (Calcular, obter, exibir)

    //Métodos sem retorno usamos VOID e o nome do método:

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 10);
    }

    //Metodos com PARAMENTROS: Parametros são variaves que passamos para o método.

    public void multiplicaDoisNumeros(int number1, int number2) {
        System.out.println("Resultado: " + number1 * number2);
    }

    //Metodos com RETORNO

    public double divideDoisNumeros(double number1, double number2) {
        return number1 / number2;
    }

    public void alteraDoisNumeros (int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera dois números");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);
    }

}

package POO.metodos.basico;

public class Ex_02_Soma {
//    Exercício 2 — Soma de Dois Números
//    Crie um método que:  Recebe dois números inteiros, Retorna a soma deles
//💡 Simples, mas aqui quero ver:
//    Nome de método limpo
//    Boa prática
    public int soma (int numero1, int numero2){
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        Ex_02_Soma somaResultado = new Ex_02_Soma();

        int resultado = somaResultado.soma(10,20);
        System.out.println("A soma do resultado é: " + resultado);

    }
}

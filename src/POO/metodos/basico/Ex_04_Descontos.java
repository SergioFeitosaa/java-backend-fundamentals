package POO.metodos.basico;

public class Ex_04_Descontos {
//    Exercício 4 — Cálculo de Desconto (Situação real 🔥)
//    Crie um método que:
//    Recebe: valor do produto (double), percentual de desconto (double), Retorna o valor final com desconto aplicado

    public double calcularDesconto(double valorDoProduto, double desconto) {
        return valorDoProduto - (valorDoProduto * desconto / 100);
    }

    public static void main(String[] args) {
        Ex_04_Descontos produto = new Ex_04_Descontos();

        double valorFinal = produto.calcularDesconto(100.0,10.0);
        System.out.println("Valor FInal: " + valorFinal);
    }

}


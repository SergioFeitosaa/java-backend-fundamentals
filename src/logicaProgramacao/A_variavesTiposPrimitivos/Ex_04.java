package logicaProgramacao.A_variavesTiposPrimitivos;

//Escreva um programa que classifique um produto em uma categoria com base em um preço e exiba a categoria correspondente
//conforme as seguintes regras:

//Econômico: preço até R$ 50,00.
//Intermediário: preço entre R$ 50,01 e R$ 200,00.
//Premium: preço acima de R$ 200,00.

public class Ex_04 {
    public static void main(String[] args) {
        double price = 150;

        if (price <= 50){
            System.out.println("Categoria do produto econônomica");
        } else if (price > 50 && price <= 200) {
            System.out.println("Categoria do produto intermediária");
        }else {
            System.out.println("Categoria do produto premium");
        }
    }
}

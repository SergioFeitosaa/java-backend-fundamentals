package logicaProgramacao.E_arrayList;
import java.util.ArrayList;

public class Ex_01 {
//    Crie um ArrayList<String> chamado nomes.
//    Faça:
//    Adicione 3 nomes
//    Mostre todos usando for
    public static void main(String[] args) {
        ArrayList<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Sérgio");
        listaDeNomes.add("Fernanda");
        listaDeNomes.add("Mariana");
        System.out.println(listaDeNomes);

        for (String nomes : listaDeNomes){
            System.out.println(nomes);
        }
    }
}

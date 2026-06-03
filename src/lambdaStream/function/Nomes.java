package lambdaStream.function;

import java.util.List;
import java.util.function.Function;

public class Nomes {
    private String nome;

    public Nomes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        Nomes nome1 = new Nomes("João");
        Nomes nome2 = new Nomes("Mari");
        Nomes nome3 = new Nomes("Carlos");
        Nomes nome4 = new Nomes("Ana");

        List<Nomes> nomes = List.of(nome1, nome2, nome3, nome4);
        List<String> nomesMaisculos =
                nomes.stream()
                        .map(nome -> nome.getNome().toUpperCase())
                        .toList();
        System.out.println(nomesMaisculos);


    }
}

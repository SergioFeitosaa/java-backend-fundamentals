package lambdaStream.MinMax;

import java.util.Comparator;
import java.util.List;

public class Candidato {
    private String nome;
    private int anosDeExepriencia;

    public Candidato(String nome, int anosDeExepriencia) {
        this.nome = nome;
        this.anosDeExepriencia = anosDeExepriencia;
    }

    public String getNome() {
        return nome;
    }

    public int getAnosDeExepriencia() {
        return anosDeExepriencia;
    }

    public static void main(String[] args) {
        Candidato candidato1 = new Candidato("João", 2);
        Candidato candidato2 = new Candidato("Maria", 8);
        Candidato candidato3 = new Candidato("Carlos", 5);
        Candidato candidato4 = new Candidato("Ana", 18);

        List<Candidato> candidatos = List.of(candidato1, candidato2, candidato3, candidato4);
        Candidato candidatoMaisExperiente = candidatos.stream()
                .max(Comparator.comparing(Candidato::getAnosDeExepriencia))
                .orElseThrow();

        System.out.println(candidatoMaisExperiente);
    }
}

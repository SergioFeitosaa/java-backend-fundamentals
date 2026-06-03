package lambdaStream.comparator;

import java.util.Comparator;
import java.util.List;

public class Candidato {
    private String nome;
    private int anosExperiencia;

    public Candidato(String nome, int anosExperiencia) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }

    public static void main(String[] args) {
        Candidato candidato1 = new Candidato("João", 2);
        Candidato candidato2 = new Candidato("Maria", 8);
        Candidato candidato3 = new Candidato("Carlos", 5);
        Candidato candidato4 = new Candidato("Ana", 18);

        List<Candidato> candidatos = List.of(candidato1, candidato2, candidato3, candidato4);
        List<Candidato> candidatoExperiencia = candidatos.stream()
                .sorted(Comparator.comparingInt(Candidato::getAnosExperiencia).reversed())
                .toList();

        System.out.println(candidatoExperiencia);

    }
}

package logicaProgramacao.E_arrayList.ex_10;

import java.util.ArrayList;

public class Domain {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 20;
        aluno1.nota = 7.5;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.idade = 22;
        aluno2.nota = 9.0;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Pedro";
        aluno3.idade = 19;
        aluno3.nota = 5.5;

        Aluno aluno4 = new Aluno();
        aluno4.nome = "Ana";
        aluno4.idade = 21;
        aluno4.nota = 8.0;

        Aluno aluno5 = new Aluno();
        aluno5.nome = "Carlos";
        aluno5.idade = 23;
        aluno5.nota = 6.0;

        ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(aluno1);
        listaDeAlunos.add(aluno2);
        listaDeAlunos.add(aluno3);
        listaDeAlunos.add(aluno4);
        listaDeAlunos.add(aluno5);

        System.out.println("Lista alunos e notas:");
        for (Aluno aluno : listaDeAlunos){
            System.out.println("Nome: " + aluno.nome +
                    " , Idade: " + aluno.idade +
                    ", Nota: " + aluno.nota);
        }

        ArrayList<Aluno> listaAlunosAprovados = new ArrayList<>();
        for (Aluno aluno : listaDeAlunos){
            if (aluno.nota >= 7){
                listaAlunosAprovados.add(aluno);
            }
        }

        System.out.println("\n=== Alunos Aprovados ===");
        for (Aluno aluno : listaAlunosAprovados) {
            System.out.println(aluno.nome);
        }

       Aluno melhorAluno = listaDeAlunos.get(0);

       for (Aluno aluno : listaDeAlunos){
           if (aluno.nota > melhorAluno.nota){
               melhorAluno = aluno;
           }
       }

        System.out.println("Quantidade alunos aprovados: " + listaAlunosAprovados.size());
        System.out.println("ALuno maior nota: " + melhorAluno.nota);

    }
}

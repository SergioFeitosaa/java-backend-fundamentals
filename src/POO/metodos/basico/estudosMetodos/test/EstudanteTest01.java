package POO.metodos.basico.estudosMetodos.test;

import POO.metodos.basico.estudosMetodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Hiei";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Keiko";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante01.imprime();
        System.out.println("===========");
        estudante02.imprime();
    }
}

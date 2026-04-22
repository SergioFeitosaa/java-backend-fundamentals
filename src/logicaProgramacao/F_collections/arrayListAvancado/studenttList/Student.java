package logicaProgramacao.F_collections.arrayListAvancado.studenttList;

public class Student {

    String nome;
    int age;

    public Student(String nome, int age) {
        this.nome = nome;
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                '}';
    }
}

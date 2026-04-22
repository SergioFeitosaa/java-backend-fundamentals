package logicaProgramacao.F_collections.arrayListAvancado.studenttList;

public class Main {
    public static void main(String[] args) {

        StudentManager student = new StudentManager();

        Student student1 = new Student("João", 20);
        Student student2 = new Student("Maria", 25);
        Student student3 = new Student("Pedro", 30);

        student.addStudent(student2);
        student.addStudent(student3);

        System.out.println(student.listStudent());

    }
}

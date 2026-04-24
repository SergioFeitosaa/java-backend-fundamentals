package logicaProgramacao.F_collections.arrayListAvancado.studenttList;

public class Main {
    public static void main(String[] args) {

        StudentManager students = new StudentManager();

        Student student1 = new Student("João", 20);
        Student student2 = new Student("Maria", 25);
        Student student3 = new Student("Pedro", 30);

        students.addStudent(student2);
        students.addStudent(student3);


        for (Student student : students.listStudent()){
            System.out.println(student);
        }

        System.out.println("Adicionando e removendo Estudante s da lista");
        students.addStudent(student1);
        students.removeStudent("Maria");

        for (Student student : students.listStudent()){
            System.out.println(student);
        }

        System.out.println("Pegando Student especifico pelo nome");
        System.out.println(students.findByName("Pedro"));

    }
}

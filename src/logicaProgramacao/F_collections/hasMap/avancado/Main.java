package logicaProgramacao.F_collections.hasMap.avancado;

import logicaProgramacao.F_collections.hasMap.avancado.model.Student;
import logicaProgramacao.F_collections.hasMap.avancado.service.StudentManager;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();
        Student student1 = new Student("Franciso", 22);
        Student student2 = new Student("Bertoleza", 30);
        Student student3 = new Student("Lupita", 27);

        // CREATE
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);

        // READ - list
        for (Student student : studentManager.listStudent()) {
            System.out.println("List Student: " + student);
        }

        // READ - find
        System.out.println("\n=== FIND ===");
        Student found = studentManager.findByName("Pedro");
        System.out.println(found != null ? found : "Not found");

        // UPDATE
        System.out.println("\n=== UPDATE ===");
        studentManager.updateStudent("Pedro", 35);
        System.out.println(studentManager.findByName("Pedro"));

        // DELETE
        System.out.println("\n=== DELETE ===");
        studentManager.removeStudent("Maria");

        for (Student s : studentManager.listStudent()) {
            System.out.println(s);


        }
    }
}
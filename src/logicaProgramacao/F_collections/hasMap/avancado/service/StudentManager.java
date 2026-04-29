package logicaProgramacao.F_collections.hasMap.avancado.service;

import logicaProgramacao.F_collections.hasMap.avancado.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager {

    private Map<String, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        this.students.put(student.getName(), student);
    }

    public Student findByName (String name){
        return students.get(name);
    }

    public List<Student> listStudent () {
        return new ArrayList<>(students.values());
    }

    public void updateStudent (String name, int newAge){
       Student student = students.get(name);
       if (student != null){
           student.setAge(newAge);
       }else {
           System.out.println("Student not found");
       }
    }

    public void removeStudent (String name){
        students.remove(name);
    }

}

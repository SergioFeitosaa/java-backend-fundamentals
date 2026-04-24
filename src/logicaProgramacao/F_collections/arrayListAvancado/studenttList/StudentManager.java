package logicaProgramacao.F_collections.arrayListAvancado.studenttList;


import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> listStudent() {
        return new ArrayList<>(students);
    }

    public Student findByName(String name) {
        for (int i = 0; i < students.size() ; i++) {
            if (students.get(i).getNome().equals(name)){
                return students.get(i);
            }
        }
        return null;
    }

    public void updateStudent (String name, int newAge){
        for (int i = 0; i <students.size(); i++) {
            if (students.get(i).getNome().equals(name)){
                students.get(i).setAge(newAge);
                break;
            }
        }
    }


    public void removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getNome().equals(name)) {
                students.remove(i);
                break;
            }
        }
    }

}

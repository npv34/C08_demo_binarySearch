package src;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<Student>();
    }

    public void insertStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> search(String keyword) {
        ArrayList<Student> data = new ArrayList<Student>();
        for (Student student : this.students) {
            if (student.getName().equals(keyword)) {
                data.add(student);
            }
        }
        return data;
    }

    public void showList(ArrayList<Student> data) {
        for (Student student : data) {
            System.out.println(student);
        }
    }
}

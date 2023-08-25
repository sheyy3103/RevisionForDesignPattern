package exercise_03.dao;

import exercise_03.enity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private static final List<Student> listStudents = new ArrayList<>();

    @Override
    public List<Student> getAllStudents() {
        return listStudents;
    }

    @Override
    public void addStudent(Student student) {
        boolean bool;
        bool = listStudents.add(student);
        if (bool)
            System.out.println("Added successfully!");
        else
            System.out.println("Added failed");
    }

    @Override
    public void updateStudent(int rollNo, Student student) {
        boolean bool = false;
        for (Student st : listStudents) {
            if (rollNo == st.getRollNo()) {
                listStudents.remove(st);
                bool = listStudents.add(student);
                break;
            }
        }
        if (bool)
            System.out.println("Updated successfully!");
        else
            System.out.println("Updated failed");

    }

    @Override
    public void removeStudent(int rollNo) {
        boolean bool = false;
        for (Student st : listStudents) {
            if (rollNo == st.getRollNo()) {
                bool = listStudents.remove(st);
                break;
            }
        }
        if (bool)
            System.out.println("Deleted successfully!");
        else
            System.out.println("Deleted failed");
    }
}

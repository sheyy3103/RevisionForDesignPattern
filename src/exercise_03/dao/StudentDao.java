package exercise_03.dao;

import exercise_03.enity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    void addStudent(Student student);
    void updateStudent(int rollNo, Student student);
    void removeStudent(int rollNo);

}

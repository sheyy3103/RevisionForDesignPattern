package exercise_03.run;

import exercise_03.dao.StudentDaoImpl;
import exercise_03.enity.Student;

import java.util.List;
import java.util.Scanner;

public class DaoDemo {
    public static void main(String[] args) {

        System.out.println();

        StudentDaoImpl dao = new StudentDaoImpl();

        while (true) {
            int choose;
            Scanner sc = new Scanner(System.in);

            System.out.println("--------------------------------MENU--------------------------------");
            System.out.println("1. Add a new student.");
            System.out.println("2. Display all students.");
            System.out.println("3. Update a student.");
            System.out.println("4. Delete a student.");
            System.out.println("5. Exit.");
            System.out.print("Pick 1 - 5: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1 -> {
                    Student student = new Student();
                    System.out.println("Enter all of the students information:");
                    student.inputData();
                    dao.addStudent(student);
                }
                case 2 -> {
                    List<Student> listStudents = dao.getAllStudents();
                    if (listStudents.isEmpty()){
                        System.out.println("No students in the list.");
                        break;
                    }
                    System.out.println("All students information:");
                    for (Student student : listStudents) {
                        System.out.println("- Student:");
                        student.displayData();
                    }
                }
                case 3 -> {
                    System.out.print("Enter roll of the student you have selected to update: ");
                    int roll = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter new student information: ");
                    Student student = new Student();
                    student.inputData();
                    dao.updateStudent(roll, student);
                }
                case 4 -> {
                    System.out.print("Enter roll of the student you have selected to delete: ");
                    int roll = Integer.parseInt(sc.nextLine());
                    dao.removeStudent(roll);
                }
                case 5 -> System.exit(dao.getAllStudents().size());
                default -> {}
            }
        }
    }
}

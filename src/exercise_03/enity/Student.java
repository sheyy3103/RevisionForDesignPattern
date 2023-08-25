package exercise_03.enity;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNo;

    public Student() {
        super();
    }

    public Student(String name, int rollNo) {
        super();
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void inputData(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("- Input name: ");
        name = sc.nextLine();
        System.out.print("- Input roll: ");
        rollNo = Integer.parseInt(sc.nextLine());
    }

    public void displayData(){
        System.out.println("\tName: " + name);
        System.out.println("\tRoll: " + rollNo);
    }
}

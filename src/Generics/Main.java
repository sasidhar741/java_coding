package Generics;

public class Main {
    public static void main(String[] args) {
        Record<Integer> integerRecord = new Record<>();
        integerRecord.display(17);

        Record<Student> studentRecord = new Record<>();
        studentRecord.display(new Student(161286, "Sasidhar D"));

    }
}

class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return "Student: Id = " + studentId + " Name = " + studentName;
    }
}

class Record<E> {
    private E record;

    public void display(E item) {
        System.out.println(item);
    }
}


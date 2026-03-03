package Set6_OOPS.Div1;
public class Student {
    String name;
    int rollNumber;

    public Student(String studentName, int studentRoll) {
        name = studentName;
        rollNumber = studentRoll;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNumber);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Sid", 101);
        Student student2 = new Student("Raj", 102);

        student1.displayInfo();
        student2.displayInfo();
    }
}

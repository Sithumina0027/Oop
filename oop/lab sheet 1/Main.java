class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sam");
        Student student2 = new Student("John");

        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 2 Name: " + student2.getName());
    }
}

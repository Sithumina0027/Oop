class Student {
  
    private String name;
    private int age;
    private char grade;

    public Student() {
        name = "Unknown";
        age = 0;
        grade = 'N';
    }

   
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

  
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 'N';
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class l22 {
    public static void main(String[] args) {
       
        Student student1 = new Student();
        System.out.println("Student 1 Information:");
        student1.displayInfo();
        System.out.println();

      
        Student student2 = new Student("Alice", 18, 'A');
        System.out.println("Student 2 Information:");
        student2.displayInfo();
        System.out.println();

        Student student3 = new Student("Bob", 20);
        System.out.println("Student 3 Information:");
        student3.displayInfo();
    }
}

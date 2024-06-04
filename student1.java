class Student {
    // Private fields
    private String name;
    private int age;
  // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
 // Getter methods
    public String getName() {
        return name;
    }
public int getAge() {
        return age;
    }
// Setter methods
public void setName(String name) {
        this.name = name;
    }
public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

public class student1 {
    public static void main(String[] args) {
        
        Student student1 = new Student("ajay", 20);
        System.out.println("Initial Name: " + student1.getName());
        System.out.println("Initial Age: " + student1.getAge());

        student1.setName("vijay");
        student1.setAge(22);

        System.out.println("Updated Name: " + student1.getName());
        System.out.println("Updated Age: " + student1.getAge());
    }
}

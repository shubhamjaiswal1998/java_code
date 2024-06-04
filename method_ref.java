import java.util.function.Function;
class Person {
    private String name;
   public Person(String name) {
        this.name = name;
    }
  public String getName() {
        return name;
    }
}
public class method_ref {
    public static void main(String[] args) {
         // Using constructor reference to create a Function that takes a String and
         // returns a Person
        Function<String, Person> ob = Person::new;
  // Creating a new Person instance using the function
        Person person = ob.apply("ajay");
        System.out.println(person.getName());  // Output: ajay
    }
}


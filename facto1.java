@FunctionalInterFace
interface xyz1{
    abstract public void f1();
}
class xyz3 {
  xyz1 ob=() ->{
    System.out.println("hello;");
    
  };
}
public class facto1 {
     
    public static void main(String[] args) {
      xyz3 ob1=new xyz3();
       ob1.ob.f1();
    }
}


interface trst1{
    abstract public void f3();
    static void f1(int n){
        int s=0;
     while (n!=0) {
        int r=n%10;
         s=s*10+r;
         n=n/10;
     }
     System.out.println(s);}

     default void f2(int n){
        System.out.println("deafult");
     }
}
 class trst2 implements trst1  {

    @Override
    public void f3() {
        System.out.println("f3");
    }
    @Override
   public void f2(int n){
    System.out.println("f2");
   }
    
}

public class test123 {
    
    public static void main(String[] args) {
        trst1.f1(123);  
    }
}

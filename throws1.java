import java.util.Scanner;
class user_exception extends Exception{
   user_exception(String str){
          super(str);
     }
}
public class throws1 {
    static void f1(){
        try{
       int arr[]={1,2,3};
       Scanner sc=new Scanner(System.in);
       System.out.println("enter size");
       int size=sc.nextInt();
       if (size>3) {
        throw new user_exception("out of bounds exception ");
       }
       arr[size]=5;
        }
        catch(user_exception e){
          System.out.println(e.getMessage());
        }
}
    public static void main(String[] args) {
        f1();
}
}

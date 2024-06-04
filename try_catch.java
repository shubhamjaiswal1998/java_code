import java.util.Scanner;
class costom extends Exception{
     costom(String str){
          super(str);
     }
}
public class try_catch {
    static void custom(){
      try {
           int i=2;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter j");
           int j=sc.nextInt();
           if (j==0) {
            throw new costom("it is custopmexception got");
           }
           int r=i/j;
           System.out.println("result is "+r);
         } 
         catch (costom e) {
            System.out.println(e);
         }
 }
    //////////////////////////////////////////////////////////////////////
    static void trys(){

        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number for divide");
            int d=sc.nextInt();
            int num=10;
            int r=num/d;
  
            int arr[]={1,2,4,4};
            System.out.println("enter a size");
            int size=sc.nextInt();
            arr[size]=5;
  
            String str=null;
            int length=str.length();
          }
          catch(ArithmeticException e){
           e.getMessage();
              
          }
          catch(ArrayIndexOutOfBoundsException e){
              e.getStackTrace();
          }
          catch(Exception e){
              System.out.println(e);
          }
          finally{
              System.out.println("it is finally block ");
           }

    }
    public static void main(String[] args) throws Exception{
        //trys();
        custom();
    }
}

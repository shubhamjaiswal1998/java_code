class xyz1 extends Thread{
    @Override
    public void run() {
       for (int i = 0; i <=50; i++) {
           System.out.println("ajay");
           try {
               Thread.sleep(1000);
           } catch (Exception e) {
               System.out.println(e);
           }
       }
   }
}
class xyz2 extends Thread{
    @Override
    public void run(){
       for (int i = 0; i <=50; i++) {
           System.out.println("vijay");
           try {
               Thread.sleep(1000);
           } catch (Exception e) {
               System.out.println(e);
           }
       }
   }
}
public class jkl {
   public static void main(String[] args) {
       xyz1 ob1=new xyz1();
       xyz2 ob2=new xyz2();
       ob1.start();
       ob2.start();
   }
}

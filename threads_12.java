//import java.lang.Thread;
class xyz1 implements Runnable{
     @Override
     public void run() {
        for (int i = 0; i <=50; i++) {
            System.out.println("ajay");  
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class xyz2 implements Runnable{
     @Override
     public void run(){
        for (int i = 0; i <=50; i++) {
            System.out.println("vijay");
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
public class threads_12 {
    public static void main(String[] args) {
      /*  System.out.println("start");
        System.out.println(Thread.currentThread().getName());//main
        System.out.println(Thread.MIN_PRIORITY);//1
        System.out.println(Thread.MAX_PRIORITY);//10
        System.out.println(Thread.NORM_PRIORITY);//5
        for (int i = 0; i <2; i++) {
            System.out.println("h1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("h2");
        }
        
        System.out.println("end");*/

        xyz1 o1=new xyz1();
        xyz2 o2=new xyz2();
        Thread ob1=new Thread(o1);
       
        ob1.start();
        
        Thread ob2=new Thread(o2);
        ob2.start();
  }
}

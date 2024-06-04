 class Innerthreads1 extends Thread{
    @Override
  public void run(){
            for (int i = 0; i <=5; i++) {
               System.out.print(i+" "); 
            }
  }}
public class threads1 {
    public static void main(String[] args) {
        System.out.println("start");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
            
        } catch (Exception e) {
            System.out.println("something wrong");
        }
        System.out.println("end");
     Innerthreads1 ob=new Innerthreads1();
        ob.start();

    }
}

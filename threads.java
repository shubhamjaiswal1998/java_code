//creating our thread using Runnable Interface
class MyThread implements Runnable {
    @Override
    public void run() {
        // task for thread...
        for (int i = 1; i <= 10; i++) {

            System.out.println("value of i is " + i);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
        }
    }}
// Creating thread using Thread class
class MyAnotherThread extends Thread {
    @Override
    public void run() {
        // task for thread
        for (int i = 10; i >= 1; i--) {
            System.out.println("another thread = " + i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
        }
    }

}
class threads {
    public static void main(String[] args) {
        // create object of MyThread class
        MyThread t1 = new MyThread();
        Thread thr = new Thread(t1);
        // object of AnotherThread
        MyAnotherThread t2 = new MyAnotherThread();
        thr.start();
        t2.start();
    }
}
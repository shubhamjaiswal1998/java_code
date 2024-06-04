class company {
    int n;
    boolean f = false;
synchronized  public void pro(int n) throws InterruptedException {
        if (f) {
            wait();
        }
        this.n = n;
        System.out.println("producer "+this.n);
        f = true;
        notify();
    }
synchronized  public int con() throws InterruptedException {
        if (!f) {
            wait();
        }
        System.out.println("consumer "+this.n);
        f=false;
        notify();
        return this.n;
    }
}
class producer extends Thread {
    company c;

    producer(company c) {
        this.c = c;
    }

    @Override
    public void run() {
        int i=1;
        while (true) {
        try {
            this.c.pro(i);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        i++;
    }
    }
}
class consumer1 extends Thread {
    company c;

    consumer1(company c) {
        this.c = c;
    }

    @Override
    public void run() {
      
        ;
        while (true) {
            try {
            this.c.con();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        
    }
}
}
public class consumer {
    public static void main(String[] args) {
        company c = new company();
        producer p = new producer(c);
        consumer1 con=new consumer1(c);
        p.start();
        con.start();
    }
}

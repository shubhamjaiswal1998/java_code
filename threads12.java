
class Company {
	int n;
	boolean available = false;
	// f=false: chance: producer
	// f=true: chance :consumer
	synchronized public void produce_item(int n) throws Exception {
		if (available) {
			wait();
		}
		this.n = n;
		System.out.println("Produced : " + this.n);
		available = true;
		notify();
	}
    synchronized public int consume_item() throws Exception {
		if (!available) {
			wait();
		}
		System.out.println("Consumed : " + this.n);
		available = false;
		notify();
		return this.n;
	}
}
class Producer extends Thread {
    Company c;
    Producer(Company c) {
		this.c = c;
	}
    @Override
	public void run() {
		int i = 1;
		while (true) {
			try {
				this.c.produce_item(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			i++;
		}
	}
}

class Consumer extends Thread {
	Company c;

	Consumer(Company c) {
		this.c = c;
	}
@Override
	public void run() {
		while (true) {
			try {
				this.c.consume_item();
			} catch (Exception e) {

				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class threads12 {

	public static void main(String[] args) {
		Company comp = new Company();
		Producer p = new Producer(comp);
		Consumer c = new Consumer(comp);
		p.start();
		c.start();

	}

}

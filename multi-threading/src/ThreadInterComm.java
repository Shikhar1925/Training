class Exchange {
	private int data;
	private boolean flag;

	public synchronized void setData() {
		try {
			if (flag)
				wait();
			data = (int) (Math.random() * 500);
			System.out.println("Set: " + data);
			notify();
			flag = true;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void getData() {
		try {
			if (!flag)
				wait();
			System.out.println("Get: "+data);
			notify();
			flag = false;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Producer extends Thread {
	private Exchange ex;

	public Producer(Exchange ex) {
		this.ex = ex;
	}

	@Override
	public void run() {
		while (true)
			ex.setData();
	}
}

class Consumer extends Thread {
	private Exchange ex;

	public Consumer(Exchange ex) {
		this.ex = ex;
	}

	@Override
	public void run() {
		while (true)
			ex.getData();
	}
}

public class ThreadInterComm {
	public static void main(String[] args) {
		Exchange ex = new Exchange();
		Producer p = new Producer(ex);
		Consumer c = new Consumer(ex);

		p.start();
		c.start();
	}
}

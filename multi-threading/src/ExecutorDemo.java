import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GoRunnable implements Runnable {
	private final long countUntil;

	public GoRunnable(long countUntil) {
		this.countUntil = countUntil;
	}

	public void run() {
		long sum = 0;
		for (long i = 1; i < countUntil; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}

public class ExecutorDemo {
	public static final int NTHREDS = 10;

	public static void main(String[] args) {
		// ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		//ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		
		ExecutorService executor = Executors.newCachedThreadPool();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 500; i++) {
			Runnable worker = new GoRunnable(10000000L + i);
			executor.execute(worker);
		}
		// This will make the executor accept no new threads
		// and finish all existing threads in the queue
		executor.shutdown();
		// wait until all threads are finish
		// executor.awaitTermination();
		while (!executor.isTerminated()) {

		}
		System.out.println("Finished all Threads");
		long end = System.currentTimeMillis();
		System.out.println("Time Taken: "+(end - start)+"ms");
	}

}

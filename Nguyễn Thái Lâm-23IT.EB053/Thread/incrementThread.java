import javax.management.RuntimeErrorException;

public class incrementThread extends Thread {

	private Counter counter;

	private int incrementsPerThread;

	public incrementThread(Counter counter, int incrementsPerThread) {
		this.counter = counter;
		this.incrementsPerThread = incrementsPerThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < incrementsPerThread; i++) {
			try {
				counter.icrement();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

}


public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		int numThreads = 6;
		int incrementsPerThread = 5;
		incrementThread[] threads = new incrementThread[numThreads];

		for (int i = 0; i < numThreads; i++) {

			threads[i] = new incrementThread(counter, incrementsPerThread);
			threads[i].start();

		}
	}

}

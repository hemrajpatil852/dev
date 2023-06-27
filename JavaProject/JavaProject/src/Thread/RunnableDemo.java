package Thread;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String s = Thread.currentThread().getName();
			System.out.println(s + "--->" + i);
		}

	}

	public static void main(String[] args) {
		RunnableDemo r = new RunnableDemo();

		Thread t = new Thread(r, "first thread");
		t.start();

		Thread t2 = new Thread(r, "second thread");
		t2.start();

	}

}

package Thread;

public class JoinMethod extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		marks();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName());

		percentage();

	}

	public void marks() {
		System.out.println("marks obtained");

	}

	public void percentage() {
		System.out.println("percentage obtained");

	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		JoinMethod j = new JoinMethod();
		j.setName("first person");
		j.start();
		j.join();

		JoinMethod j2 = new JoinMethod();
		j2.setName("second person");
		j2.start();
		j2.join();

	}

}

package Thread;

public class Thread11 extends Thread {

	
	@Override
	public void run () 
	{
		String s=Thread.currentThread().getName();
		System.out.println(s+"is executing ");
		System.out.println(Thread.currentThread().getPriority());
	}
	

	public static void main(String[] args) {

		Thread11 t= new Thread11();
		t.setName("First thread");
		t.setPriority(1);
		t.start();
		
		Thread11 t2= new Thread11();
		t2.setName("Second thread");
		t2.setPriority(MAX_PRIORITY);
		t2.start();
	}

}

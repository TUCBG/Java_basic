package 스레드;

public class 스레드사용 {

	public static void main(String[] args) {
		// Thread t1 = new Thread1();
		// Thread t2 = new Thread2();
		Thread t3 = new Thread3();
		Thread t4 = new Thread4();
		Thread t5 = new Thread5();
		
		// t1.start();
		// t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}

package MultithreadingExample;

public class Main {

//	public static void main(String[] args) {
//		MultiThr thread1 = new MultiThr(1);
//		thread1.start();					//try run() to see difference
//		
//		MultiThr thread2 = new MultiThr(2);
//		thread2.start();					//try run() to see difference
//		
//		MultiThr thread3 = new MultiThr(3);
//		thread3.start();					//try run() to see difference
//		
//		MultiThr thread4 = new MultiThr(4);
//		thread4.start();					//try run() to see difference
//	}

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {	
//				MultiThr thread = new MultiThr(i);
//				thread.start(); //  when extending thread class
			
			RunnableMultithreading myObj = new RunnableMultithreading(i);
			Thread myThread = new Thread(myObj);
			myThread.start();
		}

	}
}

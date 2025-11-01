package MultithreadingExample;

public class Main {

	public static void main(String[] args) {
		MultiThr thread1 = new MultiThr(1);
		thread1.setName("Thread 1");
						
		MultiThr thread2 = new MultiThr(2);
		thread2.setName("Thread 2");
		thread2.setPriority(Thread.MAX_PRIORITY);
		
		MultiThr thread3 = new MultiThr(3);
		thread3.setName("Thread 3");
		
		MultiThr thread4 = new MultiThr(4);
		thread4.setName("Thread 4");
		thread4.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

//	public static void main(String[] args) {
//		
//		for (int i = 1; i < 5; i++) {	
////				MultiThr thread = new MultiThr(i);
////				thread.start(); //  when extending thread class
//			
//			RunnableMultithreading myObj = new RunnableMultithreading(i);
//		    Thread myThread = new Thread(myObj);
//		    myThread.start();
//		    try {
//				myThread.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}
}

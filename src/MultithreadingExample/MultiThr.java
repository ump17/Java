package MultithreadingExample;

import javax.management.RuntimeErrorException;

public class MultiThr extends Thread{
	
	private int threadNumber;
	
	public MultiThr( int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
//		for(int i=0;i<5;i++) {
//			System.out.println(i + " from thread " + Thread.currentThread().getName() +" "+ Thread.currentThread().getPriority());
//			//if(threadNumber == 3) throw new RuntimeException();
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//			}
//		}
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}

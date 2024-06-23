package MultithreadingExample;

public class MultiThr extends Thread{
	
	private int threadNumber;
	
	public MultiThr( int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i + "from thread " + threadNumber);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

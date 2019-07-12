package 模拟生产消费过程;

public class Customer implements Runnable{
	Queue queue;
	
	Customer(Queue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		while(true) {
			queue.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

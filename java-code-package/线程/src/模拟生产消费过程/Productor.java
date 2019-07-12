package 模拟生产消费过程;

public class Productor implements Runnable{
	Queue queue;
	Productor(Queue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			queue.set(i++);
			try {
				Thread.sleep(1000);//模拟间隔
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

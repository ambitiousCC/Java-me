package 模拟生产消费过程;

public class Queue {
	private int n;
	//保证生产再消费
	boolean flag = false;
	
	//生产
	public synchronized int get() {
		if(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("消费"+n);
		flag = false;
		notifyAll();//唤醒所有线程
		return n;
	}
	//消费
	public synchronized void set(int n) {
		if(flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("生产"+n);
		this.n = n;
		flag = true;
		notifyAll();
	}
}

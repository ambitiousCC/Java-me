package 线程;

class mThread implements Runnable {
	public void run() {
		for(int i = 0; i < 30;i++)
		{
			System.out.println("进程" + Thread.currentThread().getName() + "执行了" + i + "次");
			try {
				Thread.sleep(1000);//调用休眠以后另一个线程获得cpu使用权，表示休眠多少毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class 阻塞进程方法Sleep {
	public static void main(String[] args)
	{
		mThread mt = new mThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.start();
		t2.start();
	}
}

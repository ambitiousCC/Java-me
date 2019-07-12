package 线程;

class meThread implements Runnable {
	int i = 1;//设置总执行次数
	@Override
	public void run() {
		while(i<=10)
			System.out.println(Thread.currentThread().getName() + "运行了" + (i++) + "次");
	}
}
public class 通过接口 {
	public static void main(String[] args)
	{
		meThread mt = new meThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.start();
		t2.start();
	}
}

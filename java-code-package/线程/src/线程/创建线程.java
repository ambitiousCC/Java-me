package 线程;
 
class myThread extends Thread {//继承Thread类就成为了一个线程
	public void run() {//线程方法，一定需要重写
		System.out.println(getName() + " 线程正在运行");
	}
}
//线程获得CPU的使用权是随机的
class moThread extends Thread {
	public moThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName() + "运行了" + i + "次");
		}
	}
}
public class 创建线程 {
	public static void main(String[] args)
	{
		/*
		System.out.println("主线程1");
		myThread mt = new myThread();
		mt.start();//只能调用一次线程，通过start()方法调用
		System.out.println("主线程2");
		*/
		
		//测试多线程
		moThread mt1 = new moThread("线程1");
		moThread mt2 = new moThread("线程2");
		mt1.start();
		mt2.start();
		//获取cpu占用权是随机的
	}
}
//最后，由于java不允许多继承，所以需要使用接口实现进程

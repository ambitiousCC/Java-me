package 线程;

class oThread extends Thread {
	public void run() {
		for(int i = 0;i < 500;i++)
			System.out.println(getName() + "执行了" + i + "次");
	}
}
public class 阻塞进程方法join {
	public static void main(String[] args) {
		oThread mt = new oThread();
		mt.start();
		try {
			mt.join(2);//表示优先执行的时间
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0;i < 10; i++) {
			System.out.println("主线程执行了" + i + "次");
		}
		System.out.println("主线程执行完毕");
	}
}

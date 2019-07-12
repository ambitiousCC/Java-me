package 线程;
/**
 * 线程优先级并不能绝对决定线程执行的先后顺序，有时候先调用的先执行，优先级是整型int参数，1~10，有MAX_PRIORITY表示最大MIN_PRIORITY表示最小
 * @author 崔秦
 */
class mmThread extends Thread {
	private String name;
	public mmThread(String name) {
		this.name = name;
	}
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println(name + "执行了" + i + "次");
		}
	}
}

public class 关于线程优先级 {
	public static void main(String[] args) {
		//获取主线程的优先级
		int mainPriority = Thread.currentThread().getPriority();
		System.out.println(mainPriority);
		mmThread mt1 = new mmThread("线程一");
		mmThread mt2 = new mmThread("线程二");
		mt2.setPriority(Thread.MIN_PRIORITY);
		mt1.setPriority(Thread.MAX_PRIORITY);
		mt1.start();
		mt2.start();
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
	}
}

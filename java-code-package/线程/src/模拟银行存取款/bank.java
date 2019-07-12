package 模拟银行存取款;

import java.util.Random;
/**
 * 模拟符合逻辑的存取款过程
 * @author 崔秦
 *
 */

public class bank {
	//账户余额
	private int count = 500;
	
	//存款
	public synchronized void set(int money) {
		System.out.println("存款"+money+"￥");
		this.count += money;
		System.out.println("【账户余额】"+count+"￥");
		notifyAll();//一定要唤醒等待的所有线程
	}
	//取款
	public synchronized int get() {
		int money = new Random().nextInt(100)+100;//取款范围100~200
		System.out.println("需要取款"+money+"￥");
		if(money>count) {
			System.out.println("余额不足");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("取走"+money+"￥");
		this.count -= money;
		System.out.println("【账户余额】"+count+"￥");
		notifyAll();
		return count;
	}
}

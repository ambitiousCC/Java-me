package 模拟银行存取款;

import java.util.Random;

public class Into implements Runnable{
	bank bank;
	Into(bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		int money = new Random().nextInt(100)+400;
		while(true) {
			bank.set(money);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

package 模拟银行存取款;

public class Get implements Runnable {
	bank bank;
	Get(bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		while(true) {
			bank.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

package 模拟银行存取款;

public class test {
	public static void main(String[] args)
	{
		bank bank = new bank();
		//启动两个线程
		new Thread(new Into(bank)).start();
		new Thread(new Get(bank)).start();
	}
}

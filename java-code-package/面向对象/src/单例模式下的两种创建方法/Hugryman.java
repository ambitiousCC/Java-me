package 单例模式下的两种创建方法;

public class Hugryman {
	private Hugryman() {
		
	}
	
	private static Hugryman instance = new Hugryman();//未实例化的时候就创建对象，空间换时间
	
	public static Hugryman getInstance() {
		return instance;
	}
}

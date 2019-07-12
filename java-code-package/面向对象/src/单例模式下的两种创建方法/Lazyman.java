package 单例模式下的两种创建方法;

public class Lazyman {
	private Lazyman() {
		
	}
	
	private static Lazyman instance = null;//未实例化的时候不创建对象
	
	public static Lazyman getInstance() {
		if(instance==null) {//在实例化的时候才创建
			instance = new Lazyman();
		}
		return instance;
	}
}

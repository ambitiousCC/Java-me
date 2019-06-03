package 泛型方法;

public class 泛型方法与方法重载 {
	//允许存在一个类包含两种方式
	//public static <T> void copy(Collection<T> dest,Collection<? extends T> src) {}
	//public static <T> T copy(Collection<? super T> dest, Collection<T> src) {}
	//如果调用copy方法，系统会报错
}

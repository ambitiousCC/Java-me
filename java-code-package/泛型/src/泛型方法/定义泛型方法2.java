package 泛型方法;

import java.util.*;

public class 定义泛型方法2 {
	//声明一个泛型方法，方法中带一个T形参
	/*
	static <T> void test(Collection<T> from, Collection<T> to) {
		for (T ele: from) {
			to.add(ele);
		}
	} 
	public static void main(String[] args) {
		List<Object> as = new ArrayList<>();
		List<String> ao = new ArrayList<>();
		//test(as,ao);//系统无法正确辨别出类型形参的类型
	}
	*/
	static <T> void test(Collection<? extends T> from, Collection<T> to) {
		for (T ele: from) {
			to.add(ele);
		}
	} 
	public static void main(String[] args) {
		List<Object> ao = new ArrayList<>();
		List<String> as = new ArrayList<>();
		test(as,ao);//只要前后拥有父子类关系即可成功
	}
	
}

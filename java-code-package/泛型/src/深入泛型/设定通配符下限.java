package 深入泛型;
import java.util.*;
/*
 * 	解释：为了将一个a集合中元素复制到另一个b集合中元素中，考虑到b就称为了a的父类。两个集合之间有所依赖
 */
public class 设定通配符下限 {
	public static <T> T copy(Collection<T> dest, Collection<? extends T> src) {
		T last = null;
		for(T ele : src) {
			last = ele;
			dest.add(ele);
		}
		return last;//返回最后一个被复制的元素
		//此时发现问题：元素的类型不确定（只能肯定它是T的子类），程序只能使用T来笼统的表示各种src集合的元素类型
	}
	
	public static void main(String[] args) {
		List<Number> in = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		
		//此时调用上面的该方法就会报错，因为嘛
		Integer last = copy(in,li);
	}
}

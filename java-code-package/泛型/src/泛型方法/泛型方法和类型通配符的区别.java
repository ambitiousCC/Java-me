package 泛型方法;
import java.util.*;
/*
 * 大多时候都可以使用泛型方法来替代类型通配符
 */

/*
public interface 泛型方法和类型通配符的区别<E> {
	boolean containsAll(Collection<?> c);
	boolean addAll(Collection<? extends E> c);
	//...
}
//第二种是泛型方法
public interface 泛型方法和类型通配符的区别<E> {
	<T> boolean containsAll(Collection<T> c);
	<T extends E> boolean addAll(Collection<T> c);
	//...
}

T只是用了一次，类型形参T产生的唯一效果是可以在不同的调用点传入不同的实际类型，对应这种情况应该是使用类型通配符；通配符就是被设计用来支持灵活的子类化的

而如果某一个方法中的一个形参a的类型或者放回值的类型依赖于另一个形参b的类型，那么形参b的类型声明不应该使用通配符
	形参a或者返回值的类型依赖于该形参b的类型，如果形参b的类型无法确定，程序就无法定义形参a的类型，此时只能开立使用泛型--在方法签名中声明类型形参

而泛型方法允许类型形参被用来表示
	方法的一个或者多个参数之间的类型依赖关系，
	或者方法返回值与参数之间的类型依赖关系，
如果没有这样的类型依赖关系就不应该使用泛型方法
 */
public class 泛型方法和类型通配符的区别 {
	public static <T> void copy(List<T> dest, List<? extends T> src) {};//这个就是java集合中的copy方法
	//可以见到，dest明显依赖于src
	//改写:
	//public static <T, S extends T> void copy(List<T> dest, List<S> src);
	//发现这里：类型形参S只是用了一次，其他参数的类型，方法返回值的类型都不依赖于它，所以说嘛，S在这里就没有必要存在哒，使用通配符可以替代S，使用通配符比使用泛型方法更加清晰
}

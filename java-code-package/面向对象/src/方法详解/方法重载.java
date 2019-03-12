package 方法详解;

//方法重载：允许定义的方法重名;但是输入的形参列表不能相同
//打不风的时候并不推荐重载形参个数可变的方法，降低了可读性
public class 方法重载 {
	//关于一般的方法
	public static void test()
	{
		System.out.println("无参数");
	}
	public static void test(String a)
	{
		System.out.println("是叫做重载的方法是吧："+a+":><");
	}
	
	//对于形参可变的方法
	public void test0(String... books)
	{
		System.out.println("****形参可变的方法");
		System.out.println(books[0]+books[1]);
	}
	public void test0(String earth)
	{
		System.out.println("不可变"+earth);
	}
	public static void main(String[] args)
	{
		方法重载 ev = new 方法重载();
		//根据输入的形参类型确定方法
		//当出现方法重载的时候，this找不到合适的方向，所以不能
		ev.test();//输出：无参数
		ev.test("输入对应的类型即可");//。。+
		
		//对于形参个数可以改变的
		方法重载 en = new 方法重载();
		en.test0("love you");//love you
		en.test0("a","b");
		en.test0(new String[] {"love you","?"});//定义的新的数组和直接输入的数组元素一样，需要数组输出
		//但是如果同时存在的数组的元素个数不符合会报错
	}
	
}

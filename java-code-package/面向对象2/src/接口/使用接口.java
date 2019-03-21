package 接口;
/**
 * @author 崔秦
 *
 * 	接口的作用：
 * 	定义变量，可以用于进行强制类型转换
 * 	调用接口中定义的常量
 * 	被其他类实现
 * 
 * 	一个类可以实现一个或者多个接口，继承extends，实现implements
 *	 类实现接口：
 * [修饰符] class 类名 extends 父类 implements 接口1,接口2...
 * {
 * 	类体部分
 * }
 * 
 * 一个类实现接口必须完全实现这些接口里面所定义的全部抽象方法；否则该类将保留从父接口继承到的抽象方法，也必须定义成为抽象类。
 * 实现一个接口相当于继承了一个完全抽象的类
 */
interface Product 
{
	int getProduceTime();//定义一个抽象类中包含了一个普通方法，只是被系统改成抽象方法
}
//实现接口,模拟多继承
public class 使用接口  implements 接口的概念,Product{
	private String[] printData = new String[MAX_CACHE_LINE];//从父接口得到的参数
	//记录作业数
	private int dataNum = 0;
	public void out()
	{
		//有就打印
		while(dataNum > 0)
		{
			System.out.println("打印机打印："+printData[0]);//打印入口处传入的参数值
			//作业队列整体向前前移一位，并将剩下的作业数减一								打印长度
			//下面这个方法：System.arraycopy(Object src, num, Object src, num, num)
			//							数组			开始序列	目标数组	目标数组开始起始位置
			System.arraycopy(printData, 1, printData, 0, --dataNum);//使用递推的方法
			
		}
	}
	public void getData(String msg)
	{
		if(dataNum >= MAX_CACHE_LINE)
		{
			System.out.println("输出队列已经满了，添加失败");//传入的参数值数不能超过最大的长度
		}
		else
		{
			//要答应的数据添加到队列，已经保存的数量+1
			printData[dataNum++] = msg;//增加数组的元素
		}//			    目前的数组长度加一
	}
	public int getProduceTime()
	{
		return 45;
	}
	public static void main(String[] args)
	{
		//创建对象，输出
		接口的概念 o = new 使用接口();
		o.getData("崔秦");
		o.getData("爸爸");
		o.out();
		o.getData("cuiqin");
		o.getData("father");
		o.out();
		//调用默认方法
		o.print("崔秦爸爸","崔秦爹爹","崔秦哥哥");
		o.test();
		//创建一个新的类当做接口使用
		Product p = new 使用接口();
		System.out.println(p.getProduceTime());
		//所有接口类型的引用变量都可以直接赋给Object类型的变量
		Object obj = p;
		//重写借口方法必须用public修饰，因为嘛接口里面的方法都是public，重写父类只能更大的权限或相等
		//关于这个赋值：是吧这个借口直接赋值给p就是这个
	}
}

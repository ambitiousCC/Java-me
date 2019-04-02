package 常用类;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @see		线程？？
 * @author 崔秦
 *
 */

/*
 * 	Random类生成伪随机数，构造器：一个用于以当前时间为种子，一个构造器需要显示赋值 long整型
 * 		ThreadLocalRandom并发访问下使用这个新增的类可以具有更好的线程安全性
 * 	生成随机数：	各种类型 还可以指定生成范围
 * 
 */

public class ThreadLocalRandom和Random {
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		System.out.println("rand.nextBoolean(): " + rand.nextBoolean());
		byte[] buffer = new byte[16];//创建一个字节型数组
		rand.nextBytes(buffer);
		System.out.println("Arrays.toString(buffer): " + Arrays.toString(buffer));
		//生成伪随机数 double 0.0~1.0
		System.out.println("rand.nextdouble(): " + rand.nextDouble());
		//那么生成float型呢
		System.out.println("rand.nextFloat(): " + rand.nextFloat());
		//伪高斯数: average=0.0 s = 1.0
		System.out.println("rand.newxtGaussian(): " + rand.nextGaussian());
		//生成处于int整数取值范围的伪随机整数
		System.out.println("rand.nextInt(): "+ rand.nextInt());
		//指定范围的
		System.out.println("rand.nextInt(26): " + rand.nextInt(26));
		//生成一个处于long的
		System.out.println("rand.nextLong(): " + rand.nextLong());
		System.out.println("------------------------------------");
		
		//证明伪随机数：只要种子相同，方法执行顺序相同，产生的随机数就一毛一样
		Random r1 = new Random(50);
		System.out.println("rand.nextdouble(): " + r1.nextDouble());
		System.out.println("rand.nextFloat(): " + r1.nextFloat());
		System.out.println("rand.nextInt(): "+ r1.nextInt());
		System.out.println("rand.nextLong(): " + r1.nextLong());
		System.out.println("------------------------------------");
		
		//证明伪随机数：只要种子相同，方法执行顺序相同，产生的随机数就一毛一样
		Random r2 = new Random(50);
		System.out.println("rand.nextdouble(): " + r2.nextDouble());
		System.out.println("rand.nextFloat(): " + r2.nextFloat());
		System.out.println("rand.nextInt(): "+ r2.nextInt());
		System.out.println("rand.nextLong(): " + r2.nextLong());
		System.out.println("------------------------------------");

		//证明伪随机数：只要种子相同，方法执行顺序相同，产生的随机数就一毛一样
		Random r3 = new Random(100);//而且，种子不变，随机数也不变
		System.out.println("rand.nextdouble(): " + r3.nextDouble());
		System.out.println("rand.nextFloat(): " + r3.nextFloat());
		System.out.println("rand.nextInt(): "+ r3.nextInt());
		System.out.println("rand.nextLong(): " + r3.nextLong());
		
		//为了避免这个问题呢，推荐使用当前的时间作为种子：当前时间不断改变
		Random rand2 = new Random(System.currentTimeMillis());
		
		//多线程下面使用ThreadLocalRandom方法与Random基本相似
		ThreadLocalRandom rand3 = ThreadLocalRandom.current();
		
		int val1 = rand3.nextInt(4, 20);
		double val2 =  rand3.nextDouble(2.0, 10.0);
		System.out.println(
				"--------------------------------------"+
				"\n" +
				val1 + 
				"\n" + 
				val2);
	}
}

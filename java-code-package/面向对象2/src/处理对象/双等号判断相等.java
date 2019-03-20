package 处理对象;

public class 双等号判断相等 {

	//只要两个变量的值相等，==比较就会返回true，但是比较引用变量的时候，只有他两指向同一个对象的时候才会返回true
	public static void main(String[] args)
	{
		int it = 34;
		float f1 = 34.0f;
		
		System.out.println("int与float："+(it==f1));
		
		char ch = 'A';
		//再一次说明了只要内容相等即可
		System.out.println("65与 'A'："+(65 == ch));
		
		//但是比较引用类型时只能在两个指向对象一致的时候才会true
		String a = new String("a");
		String b = new String("a");
		System.out.println("对象不一致，传入值一样时："+(a==b));
		//介绍equals方法
		System.out.println(a.equals(b));
	}
}

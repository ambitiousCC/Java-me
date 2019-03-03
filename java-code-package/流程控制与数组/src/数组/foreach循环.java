package 数组;

public class foreach循环 {
	public static void main(String[] args)
	{
		//循环可以遍历数组和集合
		String[] newArr0 = {"a",
				"b",
				"c",
				"d"};
		//格式：for(type variableName:Arrayname){}
		//使用foreach循环会遍历数组元素
		//boook会自动迭代每个数组元素
		for(String abcd:newArr0)
		{
			//形参 abcd 只是一个临时变量 暂时获得数组中的值
			//foreach不要对循环变量赋值
			System.out.println(abcd);
		}
	}
}

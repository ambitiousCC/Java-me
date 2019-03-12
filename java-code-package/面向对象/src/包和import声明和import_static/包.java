package 包和import声明和import_static;//必须作为源文件的第一条非注释型语句

public class 包 {
/**
 * 		由于这里使用的是非常好用的IDE 讲一下cmd
 * 		编译命令：javac -d . name.java
 * 		-d表示编译生成的class文件的保存位置，.表示当前路径下
 * 		编译以后会出现lee文件夹，编译文件.class保存在这个文件夹中
 * 
 * 		添加包：通过package语句指定；class文件必须放在对应的路径
 * 
 * 		包的命名规范：包名全部应该为小写
 * 		包的首末不允许是符号，中间可以插入符号：.	-
 * 
 * 		同一个包下的类可以自由访问，不需要添加包前缀
 */
	public void greatidea(String mean)
	{
		System.out.println("这里输入的是"+mean);
	}
}

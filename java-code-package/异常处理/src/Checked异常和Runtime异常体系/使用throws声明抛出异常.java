package Checked异常和Runtime异常体系;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * try-catch-finally末尾需要exception抛出未提及异常
 * 
 */
public class 使用throws声明抛出异常 {
	public static void main(String[] args) {
		try {
			System.out.println("请输入第一个整数: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			System.out.println("==========================="+"\n"+"请输入第二个整数");
			Scanner sc2 = new Scanner(System.in);
			int b = sc2.nextInt();
			test(a,b);
		} catch (ArithmeticException e) {
			System.out.println("分母不能为零");
		} catch (InputMismatchException e) {
			System.out.println("请输入数字");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("系统异常");
			e.printStackTrace();
		}
		System.out.println("=================================");
//		test2();
		try {
			test3();
		} catch (自定义异常类型捕获 e) {
			e.printStackTrace();
		}
	}
	public static void test(int a, int b) throws Exception{//此处抛出的异常必须在主函数中声明catch块
		int mod;
		mod = a / b;
		System.out.println(mod);
	}
	public static void test2() {
		try {
			System.out.println("欢迎光临，请输入年龄： ");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			if(age<18 || age>80) {
				throw new Exception("您需要亲友陪同才能入住");
			} else {
				System.out.println("欢迎入住");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 文档代码注释，在调用的时候可以获得注释解析
	 * @throws 自定义异常类型捕获
	 */
	public static void test3() throws 自定义异常类型捕获{//exception只允许抛出父类或者同类 不允许抛出子类，子类无法描述范围更广的父类
		System.out.println("欢迎光临，请输入年龄： ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<18 || age>80) {
			throw new 自定义异常类型捕获();
		} else {
			System.out.println("欢迎入住");
		}
	}
}

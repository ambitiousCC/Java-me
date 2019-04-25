package test;

import java.util.Scanner;

public class charl {
	public static void main(String[] args){ 
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("ScannerTest, Please Enter Name:"); 
	    String name = sc.nextLine();  //读取字符串型输入 
	    System.out.println("ScannerTest, Please Enter Age:"); 
	    int age = sc.nextInt();    //读取整型输入 
	    System.out.println("ScannerTest, Please Enter Salary:"); 
	    float salary = sc.nextFloat(); //读取float型输入 
	    System.out.println("Your Information is as below:"); 
	    System.out.println("Name:" + name +"\n" + "Age:"+age + "\n"+"Salary:"+salary); 
	  }
}

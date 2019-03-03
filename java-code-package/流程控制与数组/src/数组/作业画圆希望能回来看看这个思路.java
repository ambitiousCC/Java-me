package 数组;

import java.lang.Math;
import java.util.Scanner;
public class 作业画圆希望能回来看看这个思路
{
	
	public static void main(String[] args)
	{
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入圆的半径：");
		r=sc.nextInt();
		for(int i=0;i<=r;i=i+2){//上半圆
			int height=r-i;

			int width=(int)Math.round(Math.sqrt(r*r-height*height));

			for(int j=r-width;j>=0;j--){//左上
				System.out.print(" ");
			}
			System.out.print("*");


			for(int j=r-width;j<r+width;j++){//右上
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=r;i>=0;i=i-2){//下半圆
			int height=r-i;
			int width=(int)Math.round(Math.sqrt(r*r-height*height));
			for(int j=r-width;j>=0;j--){//左下半圆
				System.out.print(" ");
			}
			System.out.print("*");


			for(int j=r+width;j>r-width;j--){//右下半圆
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
package Êı×é;
import java.io.*;
import java.util.*;

public class ÂİĞı¾ØÕó {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		
		//nxnĞÍ¾ØÕó
		int i,j,k;
		int[][] a = new int[n][n];
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n; j++)
			{
				a[i][j] = 0;
			}
		}
		
		int num = 1;
		for(i = 0; i < n/2; i++)
		{
			for(j=i;j<n-i;j++)
				if(a[i][j]==0)
					a[i][j]=num++;
			for(j=i+1;j<n-i;j++)
				if(a[j][n-i-1]==0)
					a[j][n-i-1]=num++;
			for(j=n-i-1;j>i;j--)
				if(a[n-i-1][j]==0)
					a[n-i-1][j]=num++;
			for(j=n-i-1;j>i;j--)
				if(a[j][i]==0)
					a[j][i]=num++;
			
			if(n%2==1)
				a[n/2][n/2]=num;
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.print("\n");
		}
	}
}

package CONAM;

import java.util.Scanner;

public class Simpson_rule {
	public static void main(String args[])
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the number of terms(n): ");
		int n = sc.nextInt();
		System.out.println("Lower limit(a): ");
		int a = sc.nextInt();
		System.out.println("Upper Limit(b): ");
		int b = sc.nextInt();
		System.out.println("Give h: ");
		double h = sc.nextDouble();
		double x[]= new double[20];
		double y[]= new double[20];
		for(i=1;i<=n;i++)
		{
			System.out.println("Give x['"+i+"']");
			x[i]= sc.nextDouble();
			System.out.println("Give y['"+i+"']");
			y[i]= sc.nextDouble();
		}
		double sum = y[0] + y[n];
		for(i=1;i<=(n-1);i++)
		{
			if(i%2!=0)
			{
				sum = sum + 4*y[i];
			}
			else
			sum = sum+ 2*y[i];
		}
		double integral = sum *h/3;
		System.out.println("THE INTEGRAL WILL BE: " +integral);
	}
}

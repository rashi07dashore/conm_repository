package CONAM;

import java.util.Scanner;

public class secant {
	public static double f(double x)
	{
		return (x*x-x-1);
	}
	public static void main(String args[])
	{
		double a=0 , b=0 , m=0 , e=0;
		int i;
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER a: ");
		a = sc.nextDouble();
		System.out.println("ENTER b: ");
		b = sc.nextDouble();
		System.out.println("ENTER error: ");
		e = sc.nextDouble();
		}
		catch(Exception obj) 
		{
			obj.printStackTrace();
		}
			m = (a*(f(b))-b*(f(a)))/(f(b)-f(a));
			i=1;
			while(Math.abs(f(m))>e)
			{
				System.out.println(+i+" "+a+" "+b+" "+m+" "+f(m)+ " "+f(a)*f(m));
				if(f(a)*f(m)>0)
					a=m;
				else
					b=m;
				m = (a*(f(b))-b*(f(a)))/(f(b)-f(a));
				i=i+1;
			}
			System.out.println("roots = "+m);
		}
	}


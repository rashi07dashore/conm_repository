package CONAM;

import java.util.*;
import java.lang.Math;

public class Bisection_sqroot {
	public static double f(double x)
	{
		return (x*x-5);
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
		if(f(a)*f(b)>0)
		{
			System.out.println("INVALID INTERVAL");
		}
		else
		{
			m = (a+b)/2;
			i=1;
			while(Math.abs(f(m))>e)
			{
				System.out.println(+i+" "+a+" "+b+" "+m+" "+f(m)+ " "+f(a)*f(m));
				if(f(a)*f(m)>0)
					a=m;
				else
					b=m;
				m=(a+b)/2;
				i=i+1;
			}
			System.out.println("roots = "+m);
		}
	}
}

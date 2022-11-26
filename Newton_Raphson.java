package CONAM;
import java.util.*;
public class Newton_Raphson {

	public static double f(double x)
	{
		return (x*x-x-1);
	}
	public static double df(double x)
	{
		return(2*x-1);
	}
	public static void main(String args[])
	{
		double b=0, e=0, m=0;
		int i;
		System.out.println("ENTER b AND e :");
		try
		{
			Scanner sc = new Scanner(System.in);
			b = sc.nextDouble();
			e = sc.nextDouble();
		}
		catch(Exception error)
		{
			error.printStackTrace();
		}
		if(Math.abs(df(b))==0)
			System.out.println("invalid choice of b");
		else
		{
			m=b-f(b)/df(b);
			i=1;
			while(Math.abs(f(m))>e)
			{
				System.out.println(+i+" "+b+" "+m+" "+f(m));
				b=m;
				m=b-f(b)/df(b);
				i++;
			}
			System.out.println(+i+" "+b+" "+m+" "+f(m));
		}
		System.out.println("root = " +m);
	}
}

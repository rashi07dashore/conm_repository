package CONAM;

import java.util.Scanner;

public class Backward_difference {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, n ;
		double d[][]= new double[20][20];
		double x[]= new double[20];
		double y[]= new double[20];
		System.out.println("Give number of datasets: ");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Give x['"+i+"']");
			x[i]= sc.nextDouble();
			System.out.println("Give y['"+i+"']");
			y[i]= sc.nextDouble();
		}
		for(j=1;j<=(n-1);j++)
		{
			for(i=j+1;i<=n;i++)
			{
				if(j==1)
				{
					d[i][j]= y[i] - y[i-1];
				}
				else
				{
					d[i][j] = d[i][j-1]-d[i-1][j-1];
				}
			}
		}
		
		System.out.println("THE BACKWARD DIFFERENCE TABLE IS: ");
		for(j=1;j<=(n-1);j++)
		{
			for(i=1;i<=(n-j);i++)
			{
				System.out.println(d[i][j]);
			}
			System.out.println("\n");
		}
	}
}

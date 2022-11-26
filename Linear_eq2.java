package CONAM;

import java.util.Scanner;
import java.util.Calendar;

public class Linear_eq2 {
 public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	int i,j,n,k;
	double u, sum = 0.0;
	double x[]= new double[10];
	double a[][]= new double[20][20]; 
	System.out.println("Enter number of variables: ");
	n = sc.nextInt();
	System.out.println("Enter the elements of augmented matrix row-wise: ");
	for(i=1; i<=n;i++)
	{
		for(j=1;j<=(n+1);j++)
		{
			System.out.println("Give a['"+i+"']['"+j+"']: ");
			a[i][j]= sc.nextDouble();
		}
	}
	for(j=1;j<=n;j++)
	{
		for(i=1;i<=n;i++)
		{
			if(i>j)
			{
				u = a[i][j]/a[j][j];
				for(k=1; k<=n+1; k++)
                {
                    a[i][k]=a[i][k]-u*a[j][k];
                }
			}
		}
	}
	x[n]=a[n][n+1]/a[n][n];
	for(i=n-1; i>=1; i--)
    {
        sum=0;
        for(j=i+1; j<=n; j++)
        {
            sum=sum+a[i][j]*x[j];
        }
        x[i]=(a[i][n+1]-sum)/a[i][i];
    }
	System.out.println("The Solutions are: ");
	for(i=1;i<=n;i++)
	{
		System.out.println("x['"+i+"']="+x[i]);
	}
	System.out.println("NO. OF CPU RUNNING NOW: "+Runtime.getRuntime().availableProcessors());
	long startTime = Calendar.getInstance().getTimeInMillis();
	long endTime = Calendar.getInstance().getTimeInMillis();
    System.out.println("Time taken: " + (endTime - startTime) + " ms");
	
}
}

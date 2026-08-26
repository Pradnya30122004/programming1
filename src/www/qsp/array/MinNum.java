package www.qsp.array;
import java.util.Scanner;

public class MinNum {
	public static void minvalue(int[]a)
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			
			}
			
		}
		System.out.println(min);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter elements of array:");
		for(int j=0;j<a.length;j++)
		{
			a[j]=sc.nextInt();
		}
		System.out.println("Minimum value is:");
		minvalue(a);
		
		}

}

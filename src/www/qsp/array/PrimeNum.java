package www.qsp.array;
import java.util.Scanner;

public class PrimeNum {
	public static void prime(int[]a)
	{
		for(int i=0;i<a.length;i++) {
		int count=0;
		for(int j=1;j<=a[i];j++) {
			if(a[i]%j==0) {
				count++;
			}
		}if(count==2) {
			System.out.println(a[i]);
		}
		} 
 	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter elements of array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("prime numbers in array are:");
		prime(a);
	}

}

package www.qsp.array;
import java.util.Scanner;

public class CheckNum {
	public static boolean checkNum(int[]a,int b) {
	
		for(int i=0;i<a.length;i++) {
			if(b==a[i]) {
				return true;
			}
		}
		return false;
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter elements of array:");
		for(int j=0;j<a.length;j++) {
			a[j]=sc.nextInt();
		}
		System.out.println("number to be searched:");
		int d=sc.nextInt();
		boolean c=checkNum(a,d);
		System.out.println(" check element is present in array or not:");
		System.out.println(c);
	}
}

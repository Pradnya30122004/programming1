package www.qsp.array;

public class MaxNum {
	public static int m1(int[]a)
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
		  if(a[i]>max)
		  {
			  max=a[i];
		  }
		}
		return max;
	}
	public static void main(String[] args) {
		int[] b= {12,45,35,6,7};
		System.out.println(m1(b));
	}

}

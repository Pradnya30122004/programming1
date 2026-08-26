package www.qsp.array;

import java.util.Arrays;

public class Leftshift {
	public static void main(String[] args) {
		int[] b= {12,34,23,42,3};
		leftshift(b,3);
		
	}
		
		public static void leftshift(int[] b , int key) {
			for(int j=0;j<key;j++) {
			  int first=b[0];
			for(int i=0;i<b.length-1;i++) {
				b[i]=b[i+1];
			}
			b[b.length-1]=first;
		System.out.println(Arrays.toString(b));
		}
		}
}


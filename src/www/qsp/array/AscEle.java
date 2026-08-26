package www.qsp.array;

import java.util.Arrays;

public class AscEle {
	public static void main(String[] args) {
		int[] b= {32,65,43,56,78};
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					int temp=b[j];
					b[j]=b[i];
					b[i]=temp;
				}
			}
		}
		System.out.println("Array in ascending order:");
		System.out.println(Arrays.toString(b));
	}

}

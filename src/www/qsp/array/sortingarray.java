package www.qsp.array;

import java.util.Arrays;

public class sortingarray {
	public static void main(String[] args) {
		int[] arr= {43,45,23,12,56};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int num:arr) {
			System.out.println(num);
		}
	}

}

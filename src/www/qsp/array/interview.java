package www.qsp.array;

import java.util.Arrays;

public class interview {
	    public static void main(String[] args) {

	        int[] arr = {2, 4, 6, 8, 10};
	        int[] result = new int[arr.length];

	        for (int i = 0; i < arr.length; i++) {
	            result[i] = (arr[i] * 5) / 2;
	        }

	        System.out.println(Arrays.toString(result));
	    }
	}


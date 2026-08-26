package www.qsp.array;

public class RemovingDuplicates {
	public static void main(String[] args) {
	int[] arr= {10,20,30,23,34,20,10,30,23};
	for(int i=0;i<arr.length;i++) {
		boolean isboolean =false;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				isboolean=true;
				break;
			}
		}
		if(!isboolean) {
			System.out.println(arr[i]);
		}
	}
	
	}
}

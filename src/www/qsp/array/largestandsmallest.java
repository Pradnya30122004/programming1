package www.qsp.array;

public class largestandsmallest {
	public static void main(String[] args) {
		int[] a= {12,34,23,24,34};
		
		int largest =a[0];
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
			if(a[i]<smallest) {
				smallest=a[i];
			}
			
		}
		System.out.println("largest element:"+largest);
		System.out.println("Smallest element:"+smallest);
	}

}

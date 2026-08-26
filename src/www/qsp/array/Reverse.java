package www.qsp.array;

public class Reverse {
        public static void main(String[] args) {
			int[] a= {12,3,41,23,6,17};
			for(int i=0;i<a.length;i++) {
				int rev=0;
				while(a[i]!=0){
					int rem=a[i]%10;
					rev=rev*10+rem;
					a[i]=a[i]/10;
					
				}
				a[i]=rev;
				System.out.println(rev);
			}
		}
}

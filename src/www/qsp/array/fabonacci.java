package www.qsp.array;

public class fabonacci {
	public static void main(String[] args) {
		int n=10;
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		for(int i=0;i<n;i++) {
			int next =first+second;
			first=second;
			second=next;
			System.out.println(next);
		}
		
	}

}


package www.qsp.array;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {45, 32, 35, 67, 89, 343};

        palindrome(arr);
    }

    public static void palindrome(int[] a) {
        for (int i = 0; i < a.length; i++) {

            int temp = a[i];
            int num = a[i];
            int rev = 0;

            while (num != 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }

            if (rev == temp) {
                System.out.println(temp);
            }
        }
    }
}
import java.util.*;

class numberOfOneBits {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer: ");
        int N = sc.nextInt();
        int count = 0;
        while ( N != 0) {
            if ((N & 1) == 1) count++;
            N = N >> 1;
        }
        System.out.println();
        System.out.println("Number of 1 bit is = " +count);
        System.out.println();
        sc.close();
    }
}
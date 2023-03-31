import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();

        if (n.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        scanner.close();
    }
}
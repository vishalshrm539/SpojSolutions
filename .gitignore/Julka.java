import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Vishal
 */
class Julka {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = 10;
        for(int i = 1; i <= t; i++)
        {
            BigInteger total = sc.nextBigInteger();
            BigInteger k = sc.nextBigInteger();
            BigInteger div = BigInteger.valueOf(2);
            BigInteger rem = total.subtract(k);
            BigInteger both = rem.divide(div);
            BigInteger klau = both.add(k);
            System.out.println(klau);
            System.out.println(both);
        }
    }
}

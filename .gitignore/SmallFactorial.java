import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Vishal
 */
class SmallFactorial {
    
    public static void main (String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++)
        {
            int n = sc.nextInt();
            System.out.println(fact(n));
            
        }
        }
    static BigInteger fact(int n)
    {
        //BigInteger.ONE;
        //BigInteger.ZERO;
        //BigInteger.TEN;
        BigInteger bg ;
         bg = BigInteger.valueOf(1);  //for int initialisers
    //OR
    //BigInteger bg = new BigInteger("1");  for string initialisers
        for(int j = 2; j <= n; j++)
        {
            bg = bg.multiply(BigInteger.valueOf(j));
        }
        return bg;
    }
}

/**********BigInteger operations*********
int a;
* BigInteger a;

a = BigInteger.valueOf(25)



a = new BigInteger("25");
 
int c = a + b;
BigInteger C = A.add(B);
*/

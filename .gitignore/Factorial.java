import java.util.Scanner;
/**
 *
 * @author Vishal
 */
class Factorial {

public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    for(long i = 1; i <= t; i++)
    {
        long n = sc.nextLong();
        long count = 0;
        while(n >= 5)
        {
            count += n / 5;
           n = n / 5;
        }
        System.out.println(count);
    }
}
}

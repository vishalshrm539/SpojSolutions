import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Vishal
 */
 class NumberSteps {
    public static void main(String arg[]) throws IOException
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            for(long i = 1; i <= n; i++)
            {
                long x = sc.nextLong();
                long y = sc.nextLong();
                if(x - y >= 4)
                {
                   System.out.println("No Number");
                }
                else if(x < y)
                {
                   System.out.println("No Number");
                }
                else if(y == 0)
                {
                if(x == 0 || x == 2)
                {
                    System.out.println(x+y);
                }
                else
                {
                    System.out.println("No Number");
                }
                }
                else if(x == 0)
                {
                    if(y == 0)
                    {
                    System.out.println("0");
                    }
                    else
                    {
                    System.out.println("No Number");
                    }
                }
                else if(x == 0 && y == 0)
                {
                    System.out.println("0");
                }
                else if(x % 2 == 0 && y % 2 != 0)
                {
                    System.out.println("No Number");
                }
                else if(x % 2 != 0 && y % 2 == 0)
                {
                    System.out.println("No Number");
                }
                else
                {
                    if(x % 2 == 0 && y % 2 == 0)
                    {
                        System.out.println(x+y);
                    }
                    else
                    {
                        long sum = x + y;
                        long res = sum - 1;
                        System.out.println(res);
                    }
                }
            }
        }
        catch(Exception e)
        {
            return;
        }
    }
}

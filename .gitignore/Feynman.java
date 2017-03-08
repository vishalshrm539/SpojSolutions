import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Vishal
 */
 class Feynman {
    public static void main(String arg[]) throws IOException
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            while(true)
            {
            long n = sc.nextLong();
            if(n == 0)
            {
                return;
            }
             long sum = 0;
             for(long j = 1; j <= n; j++)
             {
                 sum += j * j;
             }
             System.out.println(sum);
            }
        }
        catch(Exception e)
        {
            return;
        }
    }
 }

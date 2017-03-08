import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Vishal
 */
 class Rectangles {
    public static void main(String arg[]) throws IOException
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long sum = 0;
            for(int i = 1; i <= n; i++)
            {
                int count = 0;
                int sq = (int)Math.sqrt(i);
                for(int j = 1; j <= sq; j++)
                {
                    if(i % j == 0)
                    {
                        count++;
                    }
                }
                sum += count;
            }
            System.out.println(sum);
        }
        catch(Exception e)
        {
            return;
        }
    }
 }
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Vishal
 */
 class Candy {
    public static void main(String arg[]) throws IOException
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            while(true)
            {
                long countSmall = 0;
                long count = 0;
            int n = sc.nextInt();
            if(n == -1)
            {
                return;
            }
            long a[] = new long[n];
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            long sum = 0;
            for(int j = 0; j < n; j++)
            {
            sum += a[j];
            }
            
            if(sum % n == 0)
            {
                long equal = sum / n;
             for(int k = 0; k < n; k++)
            {
            if(a[k] < equal)
            {
                countSmall = equal - a[k];
                count += countSmall;
            }
            }
             System.out.println(count);
            }
            else
            {
                System.out.println("-1");
            }
            }
        }
        catch(Exception e)
        {
            return;
        }
    }
 }
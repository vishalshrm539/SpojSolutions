import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Vishal
 */
 class Fashion {
    public static void main(String arg[]) throws IOException
    {
        try
        {
  
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int j = 1; j <= t; j++)
            {
            int sum = 0;    
            int n = sc.nextInt();
            int man[] = new int[n];
            int woman[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                man[i] = sc.nextInt();
            }
            
            for(int i = 0; i < n; i++)
            {
                woman[i] = sc.nextInt();
            }
            
            Arrays.sort(man);
            Arrays.sort(woman);
            
             for(int i = 0; i < n; i++)
            {
                sum += man[i] * woman[i];
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
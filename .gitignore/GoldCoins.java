import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Vishal
 */
 class GoldCoins {
     static long max (long a, long b)
     {
         if(a > b)
         {
             return a;
         }
         return b;
     }
     static HashMap<Long,Long> a = new HashMap<Long,Long>();
     
     static long getMax(long n)
     {
         if(n < 12)
         {
             return n;
         }
         if(a.containsKey(n))
         {
             return a.get(n);
         }
         long max = getMax(n/2) + getMax(n/3) + getMax(n/4);
         
         a.put(n,max);
         return max;
     }
    public static void main(String arg[]) throws IOException
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
             
            while((line = br.readLine()) != null)
            {
                long n = Long.parseLong(line);
         //       System.out.println(getMax(n)); 
                    
                for(long i = 0; i <= n; i++)
                {
                    a.put(i,i);
                }
                
                for(long i = 0; i <= n; i++)
                {
                 long maxval = max(a.get(i), a.get(i/2) + a.get(i/3) + a.get(i/4));
                 a.put(i,maxval);
                }
                System.out.println(a.get(n));
        }
            }
        
        catch(Exception e)
        {
            return;
        }
    }
 }
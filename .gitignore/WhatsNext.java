import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Vishal
 */
 class WhatsNext {
    public static void main(String arg[]) throws IOException
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            while(true)
            {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
                if(a == 0 && b == 0 && c == 0)
                {
                    return;
                }
                long diff1 = b - a;
                long diff2 = c - b;
                long firstTwoDiff = Math.abs(diff1);
                long nextTwoDiff = Math.abs(diff2);
                if(firstTwoDiff == nextTwoDiff)
                {
                    System.out.print("AP" +" ");
                    long next = c + diff1;
                    System.out.println(next);
                 }
                else
                {
                    System.out.print("GP" +" ");
                    long mul = b / a;
                    long next = c * mul;
                    System.out.println(next);
                }
               
            }
                }
        catch(Exception e)
        {
            return;
        }
    }
 }
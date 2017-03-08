
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author vishal
 */
class Spoj {

    public static void main(String[] args) throws IOException {
        try
        {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 1; i <= t; i++)
    {
        long a = sc.nextLong();
        long b = sc.nextLong();
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String s1Rev = "" ;
        String s2Rev = "";
        for(i =s1.length()-1;i>=0;i--)
        {
            s1Rev = s1Rev + s1.charAt(i);
        }
        
        for(i =s2.length()-1;i>=0;i--)
        {
            s2Rev = s2Rev + s2.charAt(i);
        }
        long s1Int = Long.parseLong(s1Rev);
        long s2Int = Long.parseLong(s2Rev);
        long sum = s1Int + s2Int;
        String sumS = String.valueOf(sum);
        String sumRev = "";
          for(i =sumS.length()-1;i>=0;i--)
        {
            sumRev = sumRev + sumS.charAt(i);
        }
          long result = Integer.valueOf(sumRev);
          System.out.println(result);
    }
        }
        catch(Exception e)
        {
            return;
        }
    
    }
    
}

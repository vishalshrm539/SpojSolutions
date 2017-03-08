import java.util.*;
import java.io.IOException;
//import java.lang.*;
//Time complexity = O(n*((n)^1/2))
class Main
{
	public static void main (String[] args) throws IOException
	{
            try
            {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		long k, j;
		for(long i = 1; i <= t; i++)
		{
			long m = sc.nextLong();
			long n = sc.nextLong();
			for( j = m; j <= n; j++)
			{
                            long sq = (int)Math.sqrt(j);
                            for(k = 2; k <= sq;k++)
                            {
                                if(j % k == 0)
                                {
                                    break;
                                }
                            }
                            if(k > sq && j > 1)
                            {
                                System.out.println(j);
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
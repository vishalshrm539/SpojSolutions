import java.io.IOException;
import java.util.Scanner;
 class ToNFro {
    public static void main(String arg[]) throws IOException
    {
        try
        {
             Scanner sc = new Scanner(System.in);
            while(true)
            {
           
            int col = sc.nextInt();
            if(col == 0)
            {
                return;
            }
            String mess = sc.next();
            int len = mess.length();
           // System.out.println(mess.length());
           int row = len / col;
           char a[][] = new char[row][col];
           int k = 0;
           boolean even = true;
           for(int i = 0; i < row; i++)
           {
               if(even == true)
               {
               for(int j = 0; j < col; j++)
               {
                   a[i][j] = mess.charAt(k++);
               }
               even = false;
               }
               else
               {
               for(int j = col - 1; j >= 0; j--)
               {
                   a[i][j] = mess.charAt(k++);
               }
               even = true;
               }
           }
           
           for(int i = 0; i < col; i++)
           {
               for(int j = 0; j < row; j++)
               {
                   //if(a[i][ij != 'x')
                   //{
                       System.out.print(a[j][i]);
                   //}
               }
           }
           System.out.println();
        }
        }
        catch(Exception e)
        {
            return;
        }
    }
}

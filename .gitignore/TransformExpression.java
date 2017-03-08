import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.util.ListIterator;
import java.io.IOException;
/**(a+(b*c))11
 *
 * @author Vishal
 */
 class TransformExpression {
    
    public static void main(String arg[]) throws IOException
    {
        try
        {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for(int i = 1; i <= t; i++)
{
    String exp = sc.next();
    int len = exp.length();
    Stack<Character> stack = new Stack<Character>();
    ArrayList<Character> arr = new ArrayList<Character>(len); 
    int count = 0;
    char first = exp.charAt(0);
    count++;
    int j = 1;
    
while(count > 0)
{
    if(exp.charAt(j) == '(')
    {
        count++;
    }
    else if(exp.charAt(j)=='+'||exp.charAt(j)=='-'||exp.charAt(j)=='*'||exp.charAt(j)=='/'||exp.charAt(j)=='^')
    {
        stack.push(exp.charAt(j));
    
    }
    else if(exp.charAt(j) == ')')
    {
        count--;
        arr.add(stack.lastElement());
        stack.pop();
       
    }
    else
    {
        arr.add(exp.charAt(j));
    }
    j++;
}
for(char k : arr)
{
    System.out.print(k);
}
System.out.println("");
}
    }catch(Exception e)
        {
            return;
        }
}
    
 }

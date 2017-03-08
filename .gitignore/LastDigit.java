import java.util.Scanner;
 class LD {
    public static void main(String arg[])
    {Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 1; i <= t; i++){
    int a = sc.nextInt();long b = sc.nextLong();
     if(a==0){System.out.println("0");}
     else if(b==0){System.out.println("1");}else{if(a > 10){a=a%10;}int u[] = new int[10];int k = 0;int c = 0;
     int pro = 1;boolean out = false;
  while(true){pro = pro * a;u[k++] = pro % 10;
  for(c = 0; c < k - 1; c++){if(u[c] == u[k-1]){k--;out = true; break;}}
  if(out == true){break;}}
  long r=b % k;
  int rem=(int)r;if(rem==0){System.out.println(u[k-1]);}else{System.out.println(u[rem-1]);}}}}}
import java.util.*;
import java.io.*;
public class factorial
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
int x=1;
if(n<0)
  for(int i=1;i<=n;i++)
{
x=x*i;
}
System.out.println("the factorial of the number is "+x);
else
{System.out.println(-1);
}
}




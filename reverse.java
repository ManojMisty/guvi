import java.io.*;
import java.util.*;
public class reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
char[] c=new char[s1.length()];
char[] c1=new char[s1.length()];
c=s1.toCharArray();
int n=c.length;
for(int i=0;i<c.length;i++)
{
c1[n-1]=c[i];
n--;
}
s1=String.valueOf(c1);

System.out.println(s1);
}}

import java.io.*;
import java.util.*;
public class index
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
index(arr);
}
static void index(int ar[])
{
for(int i=0;i<ar.length;i++)
if(ar[i]==i)
System.out.println(ar[i]+" "+"index:"+i);
}}

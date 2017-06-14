import java.io.*;
import java.util.*;

public class doubt1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number of elements in array");
int n=s.nextInt();
int flag=0;
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
ArrayList<Integer> list=new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
if(flag==0)
if(!list.contains(arr[i]))
{
list.add(arr[i]);

}
else
{
System.out.print(arr[i]+" ");
flag=1;
break;}
}

}}

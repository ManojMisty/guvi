import java.io.*;
import java.util.*;
 class zero
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m;
        int n,flag=0;
        System.out.println("Enter the size of two integar array");
        m=s.nextInt();
        n=s.nextInt();
        System.out.println("Enter the two array");
        int[] a=new int[m];
        int b[]=new int[n];
         for(int i=0;i<m;i++)
             a[i]=s.nextInt();
         for(int i=0;i<n;i++)
             b[i]=s.nextInt();
         int count1=0;
         for(int i=0;i<n;i++)
         {int count=b.length;
         if(flag==0)
         {
             if(b[0]==a[i])
             {int k=i;
                 for(int j=0;j<b.length;j++)
                 {
                     if(a[k]==b[j])
                     {
                         k++;
                    count1=--count;
                    if(count1==0)
                    {flag=1;
                        break;
                    }}
                 }
             }
         }}
        if(count1==0)
            System.out.println("yes");
        else
         System.out.println("no");
    }
}

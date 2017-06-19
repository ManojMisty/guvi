package tworepeat;

import java.util.Scanner;

public class twcerepeat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int flag=0;
        for(int i=0;i<n;i++)
        {
        	a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {int count=0;
        	for(int j=0;j<n;j++)
        	{
        		if(flag==0)
        		if(i!=j)
        			if(a[i]!=a[j])
        			{
        				count++;
        			}
        	}
        if(count==a.length-1)
        {
        	System.out.println(a[i]);
        	flag=1;break;
        }
        }
	}

}

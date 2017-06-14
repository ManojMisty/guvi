import java.util.Arrays;
import java.util.Scanner;

public class hunter9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int result=0;
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}


for(int i=0;i<n;i++ )
		{
	    for(int j=i+1;j<n;j++)
	    {
	    	for(int k=j+1;k<n;k++)
	    	{
	    		if(a[i]+a[j]==a[k])
	    		{
                   System.out.println("elements:"+a[i]+"\t"+a[j]+"\t"+a[k]);	    			
	    	result=1;break;}
	    		}if(result==1)
	    			break;
	    }
	    		 if(result==1)
	    			 break;
	     }
		}
	}



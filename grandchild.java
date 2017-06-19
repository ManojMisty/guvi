package grandchild;

import java.util.Scanner;

public class grandchild {
     public static int  N;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		int flag=0;
		String[][] s1=new String[n][2];
		 N=n;
		for(int i=0;i<n;i++)
		for(int j=0;j<2;j++)
		{
			s1[i][j]=s.nextLine();
		}
			System.out.println("enter grandfather name:");
			String grand=s.nextLine();
			for(int i=0;i<n;i++)
			{
				int j=1;
				if(s1[i][j].equalsIgnoreCase(grand))
				{System.out.println("Grandfather can be found");
					flag=1;
					count(s1[i][0],s1);
					break;
				}
			
			}
			if(flag==0)
				System.out.println("Grandfather cant be found");

	}
 static void  count(String v,String a[][])
{
	int z=0;
	for(int i=0;i<N;i++)
	{
		int j=1;
		if(a[i][j].equalsIgnoreCase(v))
		{
			z++;
		}
	
	}
	System.out.println(z);
}
}

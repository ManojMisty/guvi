import java.util.*;
public class simplenumber
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int a[]=new int[s1.length()];
        int k=s.nextInt();
        for(int i=0;i<a.length;i++)
        {
            a[i]=Character.getNumericValue(s1.charAt(i));
        
        }
        Arrays.sort(a);
        StringBuffer s2=new StringBuffer("");
        for(int i=0;i<a.length-k;i++)
                {
                  s2=s2.append(String.valueOf(a[i]));  
                }
        System.out.println(s2);
    }
}

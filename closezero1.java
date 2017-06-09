import java.util.Scanner;
public class closezero1 
{
 public static void main(String[] args) 
 {
 int n, x = 0, y = 1, sum, minimum;
 Scanner s = new Scanner(System.in);
 
 n = s.nextInt();
 int a[] = new int[n];
       
 for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
minimum=a[0]+a[1];
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
sum=a[i]+a[j];
if(sum<minimum)
{
x=i;
y=j;
minimum=sum;
}
}}
System.out.println(a[x]+" "+a[y]);
}}



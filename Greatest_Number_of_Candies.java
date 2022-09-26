import java.util.Scanner;
class Candies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,i;
        
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        int max=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]+k>=max)
            {
                System.out.print("True ");
            }
            else
            {
                System.out.print("False "); 
            }
        }
        
        
    }
}
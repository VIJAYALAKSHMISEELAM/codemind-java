import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n,i,j;
       n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
            for(j=1;j<=n;j++)
            {
                if(i==j || j==1 || j==n)
               {
                   System.out.print("* ");
               }
               else
               {
                   System.out.print("  ");
               }
            }
             System.out.println();
       }
      
    }
}
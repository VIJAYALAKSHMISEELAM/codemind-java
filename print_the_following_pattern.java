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
                if(i==j)
               {
                   System.out.print("*");
               }
               else if(j==1)
               {
                   System.out.print("*");
               }
               else if(i==n)
               {
                    System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
            }
             System.out.println();
       }
      
    }
}
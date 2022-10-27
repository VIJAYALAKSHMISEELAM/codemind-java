import java.util.Scanner;
class diamond
{
    public static void main(String args[])
    {
         Scanner sc =new Scanner(System.in);
         int i,j,n,c=0;
         n=sc.nextInt();
         if(3<=n && n<=100)
        { 
         for(i=1;i<=n;i++)
         {
             for(j=0;j<i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
         for(i=n-1;i>0;i--)
         {
             for(j=0;j<i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
        }
        else
        {
            System.out.println("The pattern is not possible");
        }
    }
   
}
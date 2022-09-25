import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n,i,j;
       n=sc.nextInt();
       for(i=n;i>0;i--)
       {
            for(j=1;j<=n;j++)
             {
               if(i<j)
              {
                break;
              }
              else
              {
                  System.out.print(j);
              }
            }
             System.out.println();
       }
      
    }
}
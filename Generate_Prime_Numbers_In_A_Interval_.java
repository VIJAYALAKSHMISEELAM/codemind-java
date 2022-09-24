import java.util.Scanner;
class Prime
{
    public static int is_it_prime(int i)
    {
        int j;
         for(j=2;j<=Math.sqrt(i);j++)
         {
             if(i%j==0)
             {
                 return 0;
             }
         }
       
        return 1;
    }
    public static void main(String args[])
   {
     Scanner sc =new Scanner(System.in);
     int m,n,t,i;
     m=sc.nextInt();
     n=sc.nextInt();
     for(i=m;i<=n;i++)
     {
         if(i==1)
        {
            continue;
        }
        else
         {
             t=is_it_prime(i);
             if(t==1)
            {
               System.out.println(i);
            }
         }
     }
   }
}
import java.util.Scanner;
class cirpr
{
    public static int is_it_prime(int n)
    {
        int j;
        for(j=2;j<=Math.sqrt(n);j++)
        {
            if(n%j==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int d,temp,rev=0;
        temp=n;
         if(is_it_prime(n)==1)
        {
            while(n!=0)
          {
            d=n%10;
            rev=rev*10+d;
            n/=10;
          }
          if(is_it_prime(rev)==1)
          {
              System.out.println("circular prime");
          }
          else
          {
               System.out.println("prime but not a circular prime");
          }
        }
        else
        {
            System.out.println("not prime");
        }
        
    }
}
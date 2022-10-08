import java.util.Scanner;
class primes
{
    static int prime(int i)
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
        Scanner sc=new Scanner(System.in);
        int a,b,i,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=0;
    
        for(i=a;i<=b;i++)
        {
            if(i==1)
            {
                continue;
            }
            else if(prime(i)==1)
            {
                System.out.println(i);
            }
        }
        
    }
}
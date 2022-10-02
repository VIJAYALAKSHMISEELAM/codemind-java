import java.util.Scanner;
class near
{
    public static boolean is_it_prime(int n)
    {
        int j;
        for(j=2;j<=Math.sqrt(n);j++)
        {
            if(n%j==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,c=0,d,t;
        n=sc.nextInt();
        temp=n;
        int r=(int)Math.log10(n)+1;
        if(is_it_prime(n))
        {
            while(n!=0)
            {
                d=n%10;
                if(d==2 || d==3 || d==5 || d==7)
                {
                    c+=1;
                }
                n/=10;
            }
            if(c==r)
            {
                System.out.println("Mega Prime");
            }
            else
            {
                System.out.println("Not Mega Prime");
            }
        }
        else
        {
             System.out.println("Not Mega Prime");
        }
       
    }
}
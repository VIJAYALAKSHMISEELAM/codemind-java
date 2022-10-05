import java.util.Scanner;
class Disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,sum=0,d,temp;
        n=sc.nextInt();
        r=(int)Math.log10(n)+1;
        temp=n;
        while(r!=0)
        {
           d=n%10;
           sum+=(int)Math.pow(d,r);
           n/=10;
           r-=1;
        }
        if(temp==sum)
        {
            System.out.println("True");
        }
        else
        {
             System.out.println("False");
        }
    }
}
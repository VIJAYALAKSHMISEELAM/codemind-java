import java.util.Scanner;
class happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,d;
        n=sc.nextInt();
        while(sum!=1 && sum!=4)
        {
            sum=0;
            while(n!=0)
            {
                d=n%10;
                sum+=(d*d);
                n/=10;
            }
            n=sum;
        }
        if(sum==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
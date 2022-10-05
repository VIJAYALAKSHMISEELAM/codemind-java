import java.util.Scanner;
class Disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,sum=0,d,temp,i;
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum>n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
       
    }
}
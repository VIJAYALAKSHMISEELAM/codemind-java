import java.util.Scanner;
class Spy
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,sum,pro,d;
        n=sc.nextInt();
        sum=0;
        pro=1;
        while(n!=0)
        {
            d=n%10;
            sum+=d;
            pro*=d;
            n/=10;
        }
        if(sum==pro)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}
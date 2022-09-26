import java.util.Scanner;
class Spy
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,res=0,pow,d,temp;
        n=sc.nextInt();
        pow=(int)Math.pow(n,2);
        while(pow!=0)
        {
            d=pow%10;
            res+=d;
            pow/=10;
        }
        if(res==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}
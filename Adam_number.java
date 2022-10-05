import java.util.Scanner;
class adam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,rev1=0,d,temp;
        n=sc.nextInt();
        int r;
        r=n*n;
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        temp=rev*rev;
        n=temp;
        while(n!=0)
        {
            d=n%10;
            rev1=rev1*10+d;
            n/=10;
        }
        if(r==rev1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
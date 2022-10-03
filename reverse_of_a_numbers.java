import java.util.Scanner;
class perfect
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int rev=0,d;
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        System.out.println(rev);
    }
}
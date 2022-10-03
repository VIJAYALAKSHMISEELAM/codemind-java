import java.util.Scanner;
class ugly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x=0;
        n=sc.nextInt();
        while(n!=1)
        {
            if(n%2==0)
            {
                n/=2;
            }
            else if(n%3==0)
            {
                n/=3;
            }
            else if(n%5==0)
            {
                n/=5;
            }
            else
            {
                x=1;
                System.out.println("Not Ugly Number");
                break;
            }
        }
        if(x==0)
        {
             System.out.println("Ugly Number");
        }
    }
}
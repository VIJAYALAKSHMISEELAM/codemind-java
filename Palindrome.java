import java.util.Scanner;
class Disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,sum=0,d,temp;
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
            
        }
        if(rev==temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
       
    }
}
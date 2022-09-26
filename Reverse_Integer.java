import java.util.Scanner;
import java.lang.Math;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        
        int d,rev=0,temp;
            temp=n;
            if(n<0)
            {
                n=Math.abs(n);
            }
          
            while(n!=0)
            {
                d=n%10;
                rev=rev*10+d;
                n/=10;
            }
            if(temp<0)
            {
                System.out.println("-"+rev);
            }
            else
            {
                System.out.println(rev);
            }
        
    }
}
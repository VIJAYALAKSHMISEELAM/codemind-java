import java.util.Scanner;
class perfect
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int d=0,max=0;
        while(n!=0)
        {
            d=n%10;
            if(d>max)
            {
                max=d;
            }
            n/=10;
        }
        System.out.println(max);
    }
}
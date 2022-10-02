import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t!=0)
        {
            int m,n,sum=0;
            m=sc.nextInt();
            n=sc.nextInt();
            sum=m+n;
            System.out.println(sum);
            t-=1;
        }
    }
}
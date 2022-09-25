import java.util.Scanner;
class pros
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,d=0,res;
        n=sc.nextInt();
        int sum=0,pro=1;
        while(n!=0)
        {
            d=n%10;
            sum+=d;
            pro*=d;
            n/=10;
            
        }
        if(sum<pro)
        {
            res=pro-sum;
        }
        else
        {
            res=sum-pro;
        }
         System.out.println(res);
    }
}
import java.util.Scanner;
class selfdiv
{
    public static boolean is_it_selfd(int i)
    {
        int temp=i,d;
        while(i!=0)
        {
            d=i%10;
            if(temp%d!=0)
            {
                return false;
            }
            i/=10;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,temp,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(i%10==0)
            {
                continue;
            }
            else
            {
                if(is_it_selfd(i))
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
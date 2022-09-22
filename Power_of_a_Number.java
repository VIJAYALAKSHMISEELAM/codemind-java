import java.util.Scanner;
class what
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,m,res,sol;
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        res=(int)Math.pow(x,y);
        sol=res%m;
        System.out.println(sol);
    }
}
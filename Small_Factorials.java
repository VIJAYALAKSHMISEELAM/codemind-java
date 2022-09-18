import java.util.Scanner;
class smallfac
{
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*(factorial(n-1));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int t,n,res;
         t=sc.nextInt();
         
         while(t!=0)
         {
             n=sc.nextInt();
             res=factorial(n);
             System.out.println(res);
             t-=1;
         }
         
         
    }       
    
}
import java.util.Scanner;
class difference
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,di,c=0,r,a,d;
        
        n=sc.nextInt();
         di=sc.nextInt();
         r=(int)Math.log10(n);
         d=n%((int)Math.pow(10,di));
         a=n/(int)Math.pow(10,r-di+1);
         System.out.print(Math.abs(d-a));
        
    }
}
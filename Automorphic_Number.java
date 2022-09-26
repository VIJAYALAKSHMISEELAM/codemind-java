import java.util.Scanner;
class Auto
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,d;
        n=sc.nextInt();
        int r,k;
        
        if(n<0)
        {
            n=Math.abs(n);
        }
        k=(int)Math.log10(n)+1;
        r=(int)Math.pow(n,2);
        d=r%((int)Math.pow(10,k));
        if(d==n)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}
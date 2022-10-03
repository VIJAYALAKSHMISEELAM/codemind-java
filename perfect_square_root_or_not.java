import java.util.Scanner;
class perfect
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int k;
        k=(int)Math.sqrt(n);
        if(k*k==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
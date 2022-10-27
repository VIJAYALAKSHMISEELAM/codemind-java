import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j)
                {
                    System.out.print(i+" ");
                }
                else if(i==n-j+1)
                {
                    System.out.print(i+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
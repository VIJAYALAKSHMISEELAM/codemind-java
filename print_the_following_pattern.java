import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        for(i=n;i>0;i--)
        {
            for(j=i;j>0;j--)
            {
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}
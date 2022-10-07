import java.util.Scanner;
class sumser
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i; 
        n=sc.nextInt();
        float sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+((float)1/i);
        }
        System.out.printf("%.2f",sum);
    }
}
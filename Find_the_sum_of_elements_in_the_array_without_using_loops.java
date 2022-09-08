import java.util.Scanner;
class sum
{
    public static void main(String args[] )
    {
        Scanner sc=new Scanner(System.in);
        int []a = new int[100];
        int n,i,sum;
        n=sc.nextInt();
        sum=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);
        
    }
}
import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum;
        n=sc.nextInt();
        sum=(n*(n+1))/2;
        System.out.print(sum);
        
    }
}
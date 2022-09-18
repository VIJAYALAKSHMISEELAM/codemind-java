import java.util.Scanner;
class halfList
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,h;
        int []arr=new int[10];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        h=n/2;
        for(i=n-1;i>=h;i--)
        {
            System.out.print(arr[i]+" ");
            
        }
        for(i=0;i<h;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
    }
}
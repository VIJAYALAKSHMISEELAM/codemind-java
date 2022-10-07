import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,min=9999,a,b,c=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
         b=sc.nextInt();
         for(i=0;i<n;i++)
        {
            if(a<=arr[i] && arr[i]<=b)
            {
                if(arr[i]<min)
                {
                    c=1;
                    min=arr[i];
                }
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(min);
        }
    }
}
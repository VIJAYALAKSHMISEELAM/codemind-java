import java.util.Scanner;
class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,j,temp;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            a[i]=a[i]*a[i];
        }
        
        for(j=0;j<n-1;j++)
        {
            for(i=0;i<n-1;i++)
            {
                if(a[i]>a[i+1])
              {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
              }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}
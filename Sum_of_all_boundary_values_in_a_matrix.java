import java.util.Scanner;
class matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,sum=0;
        int a[][] = new int[100][100];
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
                
            }
        }
         for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
               if(i==0 || j==0 || i==n-1 || j==m-1 )
               {
                   sum+=a[i][j];
               }
            }
        }
        System.out.println(sum);
        
    }
}
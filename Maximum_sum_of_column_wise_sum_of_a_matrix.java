import java.util.Scanner;
class matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,rsum=0,csum=0,cmax=0,rmax=0;
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
        for(i=0;i<m;i++) //n=3 m=5
        {
            csum=0;
            for(j=0;j<n;j++)
            {
                csum+=a[j][i];
            }
            if(csum>cmax)
            {
                cmax=csum;
            }
        }
           System.out.println(cmax);
        
    }
}
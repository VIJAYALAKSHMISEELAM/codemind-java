import java.util.Scanner;
class matrix_sum
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,sum=0,j;
        int [][]arr= new int[100][100];
        m=sc.nextInt();
        n=sc.nextInt();
        
          for(i=0;i<m;i++)
          {
              for(j=0;j<n;j++)
              {
                  arr[i][j]=sc.nextInt();
                  sum+=arr[i][j];
              }
          }
         System.out.println(sum);
    }
}

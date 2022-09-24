import java.util.Scanner;
class Current
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,i,j,c;
    
           n=sc.nextInt();
           int a[]=new int[n];
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    c+=1;
                }
            }
            System.out.print(c+" ");
        }
    }
}
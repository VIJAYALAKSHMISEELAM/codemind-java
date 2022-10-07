import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n-1;i++)
        {
            if(a[i-1]%2==0 && a[i+1]%2!=0)
            {
                c+=1;
            }
            else if(a[i-1]%2!=0 && a[i+1]%2==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    
    }
}
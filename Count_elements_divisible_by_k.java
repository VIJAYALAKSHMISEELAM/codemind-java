import java.util.Scanner;
class divisible
{
    public static void main(String args[])
    {
        int n,k,i,c;
        c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int []a;
        a=new int[100];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%k==0)
            {
                c+=1;
            }
            
        }
        System.out.println(c);
        
    }
}
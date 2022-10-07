import java.util.Scanner;
class robber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,k=0,c=0;
        t=sc.nextInt();
        while(t!=0)
        {
            k=sc.nextInt();
            if(k%2!=0)
            {
                c+=1;
            }
            t-=1;
        }
        if(c<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
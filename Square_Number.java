import java.util.Scanner;
class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,z,k,c=0,j; 
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++) 
            {
                if(i!=j)
                {
                    if(i*i+j*j==n)
                    {
                        c+=1;
                        System.out.println("True");
                        break;
                    }
                }
            }
            if(c==1) 
            {
                break;
            }
        }
        if(c==0)
        {
            System.out.println("False");
        }
    }

}
import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,a1,a2,a=0,b=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        { 
            if(n<=Math.pow(2,i)) 
            {
                a=i-1;
                b=i;
                break; 
                
            } 
        
        } 
        a1=n-(int)Math.pow(2,a);
        a2=(int)Math.pow(2,b)-n;
        if(a1<a2)
        {
            System.out.println(a1);
        }
        else 
        {
            System.out.println(a2); 
            
        } 
    
    }
    
}
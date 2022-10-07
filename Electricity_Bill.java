import java.util.Scanner;
class classname
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int a;
        double k; 
        String m,n; 
        m=sc.nextLine(); 
        n=sc.nextLine();
        a=sc.nextInt(); 
        if(a<=199)
        {
            k=(a*1.20)+100; 
            System.out.printf("%.2f",k);
        }
        else if(a>=200 && a<400)
        {
            k=a*1.50;
            if(k>400) 
            {
                System.out.printf("%.2f",k+k*((float)15/100)); 
                
            } 
            else
            {
                System.out.printf("%.2f",k+100);
            }
        }
        else if(a>=400 && a<=600)
        {
            k=a*1.80;
            System.out.printf("%.2f",k+k*((float)15/100));
        }
        else if (a>600)
        {
            k=a*2.00;
            System.out.printf("%.2f",k+k*((float)15/100));
        }
    }
    
}
import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        int n,d,i,c,temp,rev; 
        int []a = new int[100];
        c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            rev=0;
             temp=a[i];
             while(a[i]!=0)
             {
                 d=a[i]%10; 
                 rev=(rev*10)+d; 
                 a[i]/=10;
             }
             if(rev==temp)
             {
                 c+=1;
             }
        }
        System.out.println(c);
        
    }
    
}
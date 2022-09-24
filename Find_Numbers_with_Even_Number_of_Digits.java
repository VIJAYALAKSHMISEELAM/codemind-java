import java.util.Scanner;
class eve
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,k=0,r;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
          r=0;
          r=(int)Math.log10(a[i])+1;
          if(r%2==0)
          {
              k+=1;
          }
          
      }
      System.out.print(k);
      
    }
    
}

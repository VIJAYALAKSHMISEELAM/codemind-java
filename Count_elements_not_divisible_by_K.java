import java.util.Scanner;
class minimum
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,k;
        int []arr= new int[100];
        n=sc.nextInt();
        k=sc.nextInt();
        
          for(i=0;i<n;i++)
          {
              arr[i]=sc.nextInt();
          }
          
         for(i=0;i<n;i++)
          {
              if(arr[i]%k!=0)
              {
                  c+=1;
              }
          }
         System.out.println(c);
    }
}
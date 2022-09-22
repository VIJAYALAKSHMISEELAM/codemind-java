import java.util.Scanner;
class unique
{
    public static void main(String args[])
   { 
      Scanner sc=new Scanner(System.in);
      int n,d=0,i,j,c=0;
      int []a = new int[100];
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
          d=0;
          for(j=0;j<n;j++)
          {
              if(i==j)
              {
                  continue;
              }
              else
              {
                  if(a[i]==a[j])
                  {
                      d=1;
                      break;
                  }
              }
          }
          if(d==0)
          {
              c=1;
              System.out.print(a[i]+" ");
          }
      }
      
      if(c==0)
      {
          System.out.println("-1");
      }
   }
   
    
}
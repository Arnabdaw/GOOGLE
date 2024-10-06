import java.util.Scanner;
class basic
{
    public static void main(String[] args)
    {
       int n,i,j,k=1;
       Scanner obj=new Scanner(System.in);
       System.out.println("enter no. of line:");
       n=obj.nextInt();
       for(i=1;i<=n;i++)
       {
          for(j=1;j<=n;j++)
          {
              if(i==1 || i==n || j==1|| j==n)
              {
                  System.out.print("* ");
              }
              else
              {
                  System.out.print("  ");
              }
          }
           System.out.println();
       }
    }
}


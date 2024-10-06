import java.util.Scanner;

public class rec4
{
    static int fun(int n)
    {
        if(n==0  || n==1)
            return n;
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("enter a number:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();


        for(int i=0;i<=n;i++)
        {
            System.out.print(fun(i)+"  ");
        }
        System.out.println("\nenter the position:");
        int x=obj.nextInt();
        int ans=fun(x);
        System.out.println(x+ " th fibonacci number is: "+ans);
    }
}

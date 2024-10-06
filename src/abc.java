import java.util.Scanner;

public class abc
{
    int fact(int n)
    {
        if(n>0)
        {
            return (n*fact(n-1));
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args)
    {
        int n,ans;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        n=obj.nextInt();
        abc ob=new abc();
        ans=ob.fact(n);
        System.out.println("FACTORIAL of "+n+ " is :"+ans);
    }
}

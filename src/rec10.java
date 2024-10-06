import java.util.Scanner;

public class rec10
{
    static int fun(int n)
    {
        if(n==0 || n==1)
            return n;
        if(n%2==0)
            return fun(n-1)-n;
        return fun(n-1)+n;
    }

    public static void main(String[] args)
    {
        int num,k;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number:");
        num=obj.nextInt();
//        System.out.println("enter the value of k:");
//        k=obj.nextInt();
        int ans=fun(num);
        System.out.println("ANS="+ans);
    }
}

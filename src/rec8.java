import java.util.Scanner;

public class rec8
{
    static int fun(int p,int q)
    {
        if(q==0)
            return 1;
        int sp=fun(p,q/2);
        if(q%2==0)
            return  sp*sp;
        return (p*sp*sp);

    }
    public static void main(String[] args)
    {
        int p,q;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number:");
        p=obj.nextInt();
        System.out.println("enter the power:");
        q=obj.nextInt();
        int ans=fun(p,q);
        System.out.println("ANS="+ans);
    }
}

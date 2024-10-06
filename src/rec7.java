import java.util.Scanner;

public class rec7
{
    static int fun(int p,int q)
    {
        if(q==0)
            return 1;
        return (p*fun(p,q-1));
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

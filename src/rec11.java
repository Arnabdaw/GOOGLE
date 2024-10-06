import java.util.Scanner;

public class rec11
{
    static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    static int lcm(int a,int b)
    {
        int x=gcd(a,b);
        int ans=((a*b)/x);
        return ans;
    }

//    static int gcd(int a,int b)
//    {
//        if(a<=b)
//        {
//            for(int i=a;i>0;i--)
//            {
//                if(b%i==0 && a%i==0)
//                    return i;
//            }
//        }
//        else
//        {
//            for(int i=b;i>0;i--)
//            {
//                if(a%i==0 && b%i==0 )
//                    return i;
//            }
//        }
//
//            return 0;
//    }

//    static int gcd(int a,int b)
//    {
//        while(a%b!=0)
//        {
//            int rem=a%b;
//            a=b;
//            b=rem;
//        }
//        return b;
//    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first  number:");
        a=obj.nextInt();
        System.out.println("enter second number:");
        b=obj.nextInt();
        int ans=lcm(a,b);
        System.out.println("ANS="+ans);
    }
}

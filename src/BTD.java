import java.util.Scanner;

public class BTD
{
    int btd(int n)
    {
        int rem,ans=0,p=1;
        while(n>0)
        {
            rem=n%10;
            ans=ans+(rem*p);
            p=p*2;
            n=n/10;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int b,d;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter a binary number:");
        b=obj.nextInt();
        BTD ob=new BTD();
        d=ob.btd(b);
        System.out.println("ANS="+d);
    }
}

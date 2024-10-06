import java.util.Scanner;
public class DTB
{
    int btd(int n)
    {
        int rem,ans=0,p=1;
        while(n>0)
        {
            rem=n%2;
            ans=ans+(rem*p);
            p=p*10;
            n=n/2;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int b,d;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter a decimal number:");
        b=obj.nextInt();
        DTB ob=new DTB();
        d=ob.btd(b);
        System.out.println("ANS="+d);
    }
}

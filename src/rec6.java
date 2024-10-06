import java.util.Scanner;

public class rec6
{

        static int fun(int n)
        {
            if(n>=0 && n<=9)
                return 1;
            return (1+fun(n/10));
        }
        public static void main(String[] args)
        {
            int n;
            Scanner obj=new Scanner(System.in);
            System.out.println("enter a number:");
            n=obj.nextInt();
            int ans=fun(n);
            System.out.println("ANS="+ans);
        }
}


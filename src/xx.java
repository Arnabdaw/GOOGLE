import java.util.Scanner;
import java.lang.System;
public class xx
{
    static void add(int x,int y)
    {
        int sum=x+y;
        System.out.println("sum="+sum);
    }
    static void input()
    {
        Scanner ob=new Scanner(System.in);
        int a,b;
        System.out.println("enter the first number:");
        a=ob.nextInt();
        System.out.println("enter the second number:");
        b=ob.nextInt();
        add(a,b);
    }

     public static void main(String[] args)
    {
        input();
    }
}

import java.util.Scanner;

public class str13
{
    static void fun(String x)
    {
        StringBuilder s=new StringBuilder("");
        String ans="";
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch!=' ')
            {
                s.append(ch);
            }
            else
            {
                s.reverse();
                ans+=s+" ";
                s.delete(0,s.length());
            }
        }
        System.out.println(s);
        System.out.println(ans+s.reverse());
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String s=obj.nextLine();
        fun(s);
    }
}

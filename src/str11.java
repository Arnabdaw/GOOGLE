import java.util.Scanner;

public class str11
{
    static StringBuilder fun(StringBuilder x)
    {
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            int asci=(int)ch;

            if(ch==' ')
                continue;

            if(asci>=97)
            {
                asci-=32;
                char d=(char)asci;
                x.setCharAt(i,d);
            }

            else
            {
                asci+=32;
                char d=(char)asci;
                x.setCharAt(i,d);
            }
        }
        return x;
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string: ");
        StringBuilder str=new StringBuilder(obj.nextLine());
        StringBuilder ans=fun(str);
        System.out.println(ans);
    }
}

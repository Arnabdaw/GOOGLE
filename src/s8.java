import java.util.Scanner;

public class s8
{
    static void fun(String s,String currans)
    {
        if(s.isEmpty())
        {
            System.out.println(currans);
            return;
        }
        char ch=s.charAt(0);
        String remans=s.substring(1);
        fun(remans,currans+ch);
        fun(remans,currans);
    }
    public static void main(String[] args)
    {
        String s;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string :");
        s=obj.next();
        fun(s,"");
    }
}

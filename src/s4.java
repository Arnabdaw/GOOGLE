import java.util.Scanner;

public class s4
{
    static String fun(String s)
    {
        String ans="";
        if(s.isEmpty())
            return ans;
        ans=fun(s.substring(1));
        return ans+s.charAt(0);
    }
    static void pal(String s)
    {
        String rev=fun(s);
        if(s.equals(rev))
        {
            System.out.println(s+" is palindrome");
        }
        else
        {
            System.out.println(s+" is NOT palindrome");
        }
    }
    public static void main(String[] args)
    {
        String s;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string:");
        s=obj.nextLine();
        pal(s);
    }
}

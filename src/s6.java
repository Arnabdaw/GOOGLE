import java.util.Scanner;

public class s6
{
    static boolean pal(String s,int l,int r)
    {
        if(l>=r)
            return true;
        if(s.charAt(l)!=s.charAt(r))
            return false;
        return pal(s,l+1,r-1);
    }
    public static void main(String[] args)
    {
        String s;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string:");
        s=obj.nextLine();
        if(pal(s,0,s.length()-1))
            System.out.println("palindrome");
        else
            System.out.println("NOT palindrome");
    }
}

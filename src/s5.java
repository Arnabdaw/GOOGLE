import java.util.Scanner;

public class s5
{
    static void pal(String s)
    {
        int  i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                System.out.println(s+" is not palindrome");
                return;
            }
            else
            {
                i++;
                j--;
            }
        }
        System.out.println(s+" is palindrome");
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

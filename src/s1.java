import java.util.Scanner;

public class s1
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string:");
        String s=obj.nextLine();
        for(int i=0;i<s.length();i++)
            System.out.print(s.charAt(i)+"  ");
        System.out.println();
        System.out.println(s.substring(0,5));

    }
}

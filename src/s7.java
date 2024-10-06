import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class s7
{
    static ArrayList<String> fun(String s)
    {
        ArrayList<String> ans=new ArrayList<>();
        ArrayList<String >smallans=new ArrayList<>();

        //base case
        if(s.isEmpty())
        {
            ans.add("");
            return ans;
        }


        //recursive work
        char ch=s.charAt(0);
        smallans=fun(s.substring(1));

        //self work
        for (String ss:smallans)
        {
            ans.add(ss);
            ans.add(ch+ss);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String s;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string");
        s=obj.next();
        ArrayList<String> result=fun(s);
        for(String i:result)
            System.out.println(i);
    }
}

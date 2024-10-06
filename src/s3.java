import jdk.dynalink.beans.StaticClass;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class s3
{
    static String fun(String s)
    {
        String ans="";
        if(s.isEmpty())
            return ans;
        ans=fun(s.substring(1));
        return ans+s.charAt(0);
    }
    public static void main(String[] args)
    {
        String s;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string:");
        s=obj.nextLine();
        String ans=fun(s);
        System.out.println(ans);

    }
}

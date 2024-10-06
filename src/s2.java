import java.util.Scanner;

public class s2
{
//    static String fun(String s,int idx)
//    {
//        String ans="";
//        if(idx==s.length())
//           return ans;
//        if(s.charAt(idx)!='a')
//           ans+=s.charAt(idx);
//        return ans+fun(s,idx+1);
//    }

    static String fun(String s)
    {
        String ans="";
        if(s.isEmpty())
           return ans;
        if(s.charAt(0)!='a')
           ans+=s.charAt(0);
        return ans+fun(s.substring(1));
    }

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String s;
        System.out.println("enter any string:");
        s=obj.nextLine();
        String ans=fun(s);
        System.out.println(ans);
    }
}

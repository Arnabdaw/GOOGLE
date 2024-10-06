import java.util.Scanner;

public class str14
{
    static void fun(String x)
    {
        StringBuilder ans=new StringBuilder("");
        int count =1;
        ans.append(x.charAt(0));
        for(int i=1;i<x.length();i++)
        {
            char prev=x.charAt(i-1);
            char curr=x.charAt(i);
            if(curr==prev)
            {
                count++;
            }
            else
            {
                if(count>1)
                {
                    ans.append(count);
                }
                count=1;
                ans.append(curr);
            }
        }
        if(count>1)
            ans.append(count);
        System.out.println(ans);
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string: ");
        String s=obj.nextLine();
        fun(s);
    }
}

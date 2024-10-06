import java.util.Scanner;

public class str12
{
    static boolean pal(String y)
    {
        int i=0;
        int j=y.length()-1;
        while(i<j)
        {
            if(y.charAt(i)!=y.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static int fun(String x)
    {
        int count=0;
        String ans=" ";
        for(int i=0;i<x.length();i++)
        {
            for(int j=i+1;j<=x.length();j++)
            {
                ans=x.substring(i,j);
                System.out.print(ans+" ");
                if(pal(ans))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string: ");
        String s=obj.nextLine();
        int ans=fun(s);
        System.out.println("\nno of palindromic substring: "+ans);
    }
}

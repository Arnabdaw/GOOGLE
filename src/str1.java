import java.util.Scanner;
public class str1
{
    public static void main(String[] args)
    {
        int i,size;
        String r="ARNAB DAW";
        String r1=" ";
        size=r.length();
        for(i=size-1;i>=0;i++)
        {
            r1=r1+r.charAt(i);
        }
        System.out.println(r1);
        System.out.println("size="+size);
    }
}

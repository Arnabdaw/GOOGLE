import java.util.Scanner;

public class s11
{
    static void fun(String dig,String[] kp,String result)
    {
        if(dig.isEmpty())
        {
            System.out.print(result+" ");
            return;
        }
        int currnum=dig.charAt(0)-'0';
        String currchoice=kp[currnum];
        for(int i=0;i<currchoice.length();i++)
        {
            fun(dig.substring(1),kp,result+currchoice.charAt(i));
        }
    }

    public static void main(String[] args)
    {
        String dig;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number:");
        dig=obj.next();
        String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        fun(dig,kp,"");
    }
}


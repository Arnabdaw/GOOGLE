import java.util.Scanner;

public class bs4
{
    static int fun(int x)
    {
        int ans=-1;
        int st=0;
        int end=x;
        while(st<=end)
        {
            int mid=st+((end-st)/2);
            int val=mid*mid;
            if(val==x)
            {
                return mid;
            }
            else if (val>x)
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
     public static void main(String[] args)

        {

            Scanner obj=new Scanner(System.in);
            int n;
            System.out.println("enter any number : ");
            n=obj.nextInt();
            int ans=fun(n);
            System.out.println("square root of " +n+ " is: " +ans);
        }
}

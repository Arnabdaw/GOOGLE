import java.util.Scanner;

public class bs3
{
    static int  fun(int a[],int x)
    {
        int st=0;
        int end=a.length-1;
        int f=-1;
        while(st<=end)
        {
            int mid=st+((end-st)/2);
            if(a[mid]==x)
            {
                f=mid;
                st=mid+1;
            }
            else if (x<a[mid])
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return f;
    }
    public static void main(String[] args)
    {
        int arr[]={5,5,5,5,6,6,7,8,9};
        Scanner obj=new Scanner(System.in);
        int target;
        System.out.println("enter the value to be searched: ");
        target=obj.nextInt();
        int ans=fun(arr,target);
        System.out.println(ans);
    }
}

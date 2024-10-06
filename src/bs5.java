import java.util.Scanner;

public class bs5
{
    static int fun(int a[])
    {
        int st=0;
        int end=a.length-1;
        while(st<=end)
        {
            int mid=st+((end-st)/2);
            if(a[mid-1]>a[mid] && a[mid]<a[mid+1])
            {
                return mid;
            }
            else if (a[mid]>a[a.length-1])
            {
                st=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int arr[]={3,4,5,1,2};
        Scanner obj=new Scanner(System.in);
        int target;
//        System.out.println("enter the value to be searched: ");
//        target=obj.nextInt();
        int ans=fun(arr);
        System.out.println(ans);
    }
}

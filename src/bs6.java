import java.util.Scanner;

public class bs6
{
    static int fun(int a[],int x)
    {
        int st=0;
        int end=a.length-1;
        int ans=-1;
        while (st<=end)
        {
            int mid=st+((end-st)/2);
            if(a[mid]==x)
            {
                return mid;
            }
            if(a[mid]<a[end])
            {
                if(x>a[mid] && x<=a[end])
                {
                    st=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }


            else
            {
                if(x>a[st] && x<a[mid])
                {
                    end=mid-1;
                }
                else
                {
                    st=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[]={5,6,7,8,9,10,1,2,3,4};
        Scanner obj=new Scanner(System.in);
        int target;
        System.out.println("enter the value to be searched: ");
        target=obj.nextInt();
        int ans=fun(arr,target);

        System.out.println(ans);
    }
}

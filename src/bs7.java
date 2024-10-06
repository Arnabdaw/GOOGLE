import java.util.Scanner;

public class bs7
{
    static boolean fun(int[] a,int x)
    {
        int st=0;
        int end=a.length-1;
        while(st<=end)
        {
            int mid=st+((end-st)/2);
            if(a[mid]==x)
                return true;

            while(a[st]==a[mid] && a[mid]==a[end])
            {
                st++;
                end--;
            }
            if (a[st]<=a[mid])
            {
                if(x>=a[st] && x<a[mid])
                {
                    end=mid-1;
                }
                else
                {
                    st=mid+1;
                }
            }
            else
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
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[]={0,0,0,1,1,1,2,0,0,0};
        Scanner obj=new Scanner(System.in);
        int target;
        System.out.println("enter the value to be searched: ");
        target=obj.nextInt();
        boolean ans=fun(arr,target);
        System.out.println(ans);
    }
}

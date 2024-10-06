import java.util.Scanner;

public class bs10
{
    static int fun(int a[])
    {
        int st=0;
        int end=a.length-1;
        while(st<=end)
        {
            int mid=st+((end-st)/2);
            if((mid==0 || a[mid]>a[mid-1]) && (mid==end || a[mid]>a[mid+1]))
                return a[mid];
            else if(a[mid]<a[mid+1])
                st=mid+1;
            else
                end=mid-1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {8,1,3,4,5,6};
        Scanner obj = new Scanner(System.in);
//        int target;
//        System.out.println("enter the value to be searched: ");
//        target=obj.nextInt();
        int ans = fun(arr);
        System.out.println(ans);
    }
}
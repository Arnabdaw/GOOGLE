import java.util.Scanner;

public class hope
{
    static int fuck(int arr[])
    {
        int ans=-1;
        for(int i =0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    ans=arr[i];
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int i, size;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size = obj.nextInt();
        int[] a = new int[size];
        System.out.println("enter the array elements:");
        for (i = 0; i < a.length; i++) {
            a[i] = obj.nextInt();
        }
        int ans = fuck(a);
        System.out.println("repeted element:" + ans);
    }
}

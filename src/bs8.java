import java.util.Scanner;

public class bs8
{
    static boolean fun(int a[][],int x)
    {
        int n=a.length;
        int m=a[0].length;
        int st=0;
        int end=n*m-1;
        while(st<=end)
        {
            int mid=st+((end-st)/2);
            if(a[mid/m][mid%m]==x)
                return true;
            if(x>a[mid/m][mid%m])
            {
                st=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Scanner obj=new Scanner(System.in);
        int target;
        System.out.println("enter the value to be searched: ");
        target=obj.nextInt();
        boolean ans=fun(arr,target);
        System.out.println(ans);
    }
}

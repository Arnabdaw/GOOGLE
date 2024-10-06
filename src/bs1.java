import java.util.Scanner;

public class bs1
{
    static boolean fun(int a[],int x)
    {
        int st=0;
        int end=a.length-1;

        while(st<=end)
        {
            int mid=(st+end)/2;
            if(a[mid]==x)
            {
                return true;
            }
            if(x<a[mid])
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int size;
        Scanner obj =new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int a[]=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("enter the target value:");
        int target=obj.nextInt();
        boolean ans=fun(a,target);
        System.out.println(ans);
    }
}

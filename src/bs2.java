import java.util.Scanner;

public class bs2
{
    static boolean fun(int a[],int st,int end,int x)
    {

        if(st>end)
        {
            return false;
        }
        int mid=(st+end)/2;
        if(x==a[mid])
        {
            return true;
        }
        else if (x<a[mid])
        {
            end=mid-1;
            return fun(a,st,end,x);
        }
        else
        {
            st=mid+1;
            return fun(a,st,end,x);
        }
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
        boolean ans=fun(a,0,size-1,target);
        System.out.println(ans);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class s10
{
    static int fun(int[] a,int idx)
    {
        if(idx==a.length-1)
        {
            return 0;
        }

        int fd=Math.abs(a[idx]-a[idx+1])+fun(a,idx+1);
        if(idx==a.length-2)
            return fd;
        int sd=Math.abs(a[idx]-a[idx+2])+fun(a,idx+2);
        return Math.min(fd,sd);
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=obj.nextInt();
        int a[]=new int[size];
        System.out.println("enter the array elements:");
        for (int i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        int ans=fun(a,0);
        System.out.println("MIN COST="+ans);
    }
}

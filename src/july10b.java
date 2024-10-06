import java.util.Scanner;

public class july10b
{
    static int[] prefsum(int a[])
    {
        int i=1;
        int ps[]=new int[a.length];
        ps[0]=a[0];
        while(i<a.length)
        {
            ps[i]=(a[i]+ps[i-1]);
            i++;
        }
        return ps;
    }

    static int[] suffsum(int a[])
    {
        int ss[]=new int[a.length];
        ss[a.length-1]=a[a.length-1];
        int i=a.length-2;
        while(i>=0)
        {
            ss[i]=(a[i]+ss[i+1]);
            i--;
        }
        return ss;
    }
    static boolean com(int a[],int[] b)
    {

        for(int i=0;i<=a.length-2;i++)
        {
            if(a[i]==b[i+1])
            {
                return true;
            }
        }
        return false;
    }
    static void pnt(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
    static void fun(int a[])
    {

        int ps[]=prefsum(a);
        pnt(ps);
        int ss[]=suffsum(a);
        pnt(ss);
        boolean ans=com(ps,ss);
        System.out.println("ANS="+ans);
    }
    public static void main(String[] args)
    {
        int i, size;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array elements:");
        for (i = 0; i < size; i++)
        {
            arr[i] = obj.nextInt();
        }
        fun(arr);
    }
}

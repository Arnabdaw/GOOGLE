import java.util.Scanner;

public class A
{
    static int lar (int[] a)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    static int seclar(int a[])
    {
        int max=lar(a);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==max)
            {
                a[i]=Integer.MIN_VALUE;
            }
        }
        int lar2nd=lar(a);
        return lar2nd;
    }

    public static void main(String[] args)
    {
        int i,size;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int[] a=new int[size];
        System.out.println("enter the array elements:");
        for(i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
        int ans=seclar(a);
        System.out.println("Second Largest element :"+ans);
    }
}

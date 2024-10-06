import java.util.Scanner;

public class july10c
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


    static boolean com(int a[])
    {

        for(int i=0;i<a.length-2;i++)
        {
            int sufsum=a[a.length-1]-a[i];
            if(a[i]==sufsum)
            {
                return true;
            }
        }
        return false;
    }



    static void fun(int a[])
    {
        int b[]=prefsum(a);
        pnt(b);
        boolean ans=com(b);
        System.out.println("ANS="+ans);
    }


    static void pnt(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
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


import java.util.Arrays;
import java.util.Scanner;

public class stg4
{
    static void pnt(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    static void merge(int a[],int l,int mid,int r)
    {
        int b[]=new int[r+1];
        int i=l;
        int j=mid+1;
        int k=l;
        while(i<=mid && j<=r)
        {
            if(a[i]<a[j])
            {
                b[k]=a[i];
                i++;
            }
            else
            {
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid)
        {
            while(j<=r)
            {
                b[k]=a[j];
                j++;
                k++;
            }
        }
        else
        {
            while(i<=mid)
            {
                b[k]=a[i];
                k++;
                i++;
            }
        }

        for(k=l;k<=r;k++)
        {
            a[k]=b[k];
        }
    }
    static void mergesort(int a[],int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            mergesort(a,l,mid);
            mergesort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("enter the size of the array: ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        mergesort(a,0,n-1);
        System.out.println("AFTER SORTING:");
        pnt(a);
    }
}

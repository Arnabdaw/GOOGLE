import java.util.Scanner;

public class july9c
{
    static int[] fun(int a[])
    {
        int i,j;
        i=0;
        j=a.length-1;
        int k=a.length-1;
        int ans[]=new int[a.length];
        while(i<=j)
        {
            if(Math.abs(a[i])>Math.abs(a[j]))
            {
                ans[k--]=a[i]*a[i];
                i++;
            }
            else
            {
                ans[k--]=a[j]*a[j];
                j--;
            }
        }
        return ans;
    }
//    static int[] fun(int a[])
//    {
//        int i,j;
//        i=0;
//        j=a.length-1;
//        int k=0;
//        int ans[]=new int[a.length];
//        while(i<=j)
//        {
//           if(Math.abs(a[i])>Math.abs(a[j]))
//           {
//               ans[k++]=a[i]*a[i];
//               i++;
//           }
//           else
//           {
//               ans[k++]=a[j]*a[j];
//               j--;
//           }
//        }
//        reverse(ans,0,ans.length-1);
//        return ans;
//    }
    static void reverse(int a[],int s,int e)
    {
        while(s<e)
        {
            swap(a,s,e);
            s++;
            e--;
        }
    }
    static void swap(int arr[], int s, int e)
    {
        int temp;
        temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    static void pnt(int a[])
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + "  ");
        }
    }
    public static void main(String[] args)
    {
        int i, size;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array elements:");
        for (i = 0; i < arr.length; i++)
        {
            arr[i] = obj.nextInt();
        }
        int ans[]=fun(arr);
        System.out.println("sorted array:");
        pnt(ans);
    }
}

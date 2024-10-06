import java.util.Scanner;

public class rec13
{
//    static int fun(int a[],int idx)
//    {
//       int max=a[idx];
//        if(idx==a.length-1)
//           return max;
//       int x=fun(a,idx+1);
//        if(x>max)
//            max=x;
//       return max;
//    }
      static int fun(int a[],int idx)
      {
          if(idx==a.length-1)
              return a[idx];
          int smallans=fun(a,idx+1);
          return Math.max(a[idx],smallans);
      }

    public static void main(String[] args)
    {
        int size;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        int max=fun(arr,0);
        System.out.println("ANS="+max);
    }
}

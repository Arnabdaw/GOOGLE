import java.util.Scanner;

public class rec16
{


        static int  fun(int a[],int x,int idx)
        {
            if(idx==a.length)
                return -1;
            if(a[idx]==x)
                return idx;
            return (fun(a,x,idx+1));

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
            System.out.println("enter any number:");
            int x=obj.nextInt();
           int ans=fun(arr,x,0);
           System.out.println(ans);
        }
    }


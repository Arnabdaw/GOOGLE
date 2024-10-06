import java.util.Scanner;

public class bs9
{
    static boolean fun(int[][] a,int x)
    {
        int n=a.length;
        int m=a[0].length;
        int i=0;
        int j=m-1;
        while(i<n && j>=0)
        {
            int ele=a[i][j];
            if(ele==x)
                return true;
            if(x>ele)
                i++;
            else
                j--;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        Scanner obj=new Scanner(System.in);
        int target;
        System.out.println("enter the value to be searched: ");
        target=obj.nextInt();
        boolean ans=fun(arr,target);
        System.out.println(ans);
    }
}

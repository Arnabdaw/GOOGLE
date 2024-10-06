import java.util.Scanner;
public class stg6
{
    static void swap(String a[],int x,int y)
    {
        String temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void pnt(String a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
    static void fun(String a[])
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[min].compareTo(a[j])>0)
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                swap(a,i,min);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int size;
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        String fruits[]=new String[size];
        System.out.println("enter the fruits:");
        for(int i=0;i<size;i++)
        {
            fruits[i]=obj.next();
        }
        fun(fruits);
        pnt(fruits);
    }
}

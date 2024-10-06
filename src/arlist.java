import java.util.ArrayList;
public class arlist
{
    public static void main(String[] args)
    {
//        Integer i=Integer.valueOf(3);
//        System.out.println(i);
//        Float d=Float.valueOf(4.3f);
//        System.out.println(d);
        ArrayList<Integer>l1=new ArrayList<Integer>();
        ArrayList<Float> l2=new ArrayList<>();
        ArrayList<Boolean>l3=new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));
        System.out.println(l1);
        System.out.println("size of arraylist="+l1.size());
        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i)+"  ");
        }
        System.out.println();
        l1.add(0,100);
        System.out.println(l1);
        l1.add(2,200);
        System.out.println(l1);
        l1.set(0,10);
        l1.set(2,20);
        System.out.println(l1);
        l1.remove(0 );
        l1.remove(1);
        System.out.println(l1);
        l1.remove(Integer.valueOf(7));
        l1.remove(Integer.valueOf(12));
        System.out.println(l1);
        System.out.println(l1.remove(Integer.valueOf(17)));
        System.out.println(l1.remove(Integer.valueOf(8)));
        System.out.println(l1);
        boolean ans=l1.contains(5);
        System.out.println(ans);

//        if u dont specify the class ,we can put anything inside the arraylist

        ArrayList l=new ArrayList();
        l.add("Arnab");
        l.add(9.33);
        l.add(true);
        l.add("22UCS191");
        l.add(2215343);
        System.out.println(l);
    }
}

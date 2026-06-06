import java.util.*;
public class LeftRightRotate{
    public static void main(String args[])
    {
        int a[]={4,12,8,6,15,5,9,20};
        int k=2;
        ArrayList<Integer>al=new ArrayList<>();
        for(int num:a)
        {
            al.add(num);
        }
        Collections.rotate(al,k);//left rotate
        System.out.println(al);
        Collections.rotate(al,-k);//right rotate
        System.out.print(al);
    }
}

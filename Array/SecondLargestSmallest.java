import java.util.*;
public class SecondLargestSmallest{
    public static void main(String args[])
    {
        int a[]={4,6,2,3,8,9};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Arrays.sort(a);
        if(a.length==1||a.length==0)
        {
            System.out.print(-1);
        }
        else
        {
            System.out.println("Second Largest "+a[a.length-2]);
            System.out.print("Second Smallest "+a[1]);
        }
    }
}

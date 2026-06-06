import java.util.*;
public class MaximumNum{
    public static void main(String args[])
    {
        int a[]={4,6,2,3,8,9};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.print(max);
    }
}

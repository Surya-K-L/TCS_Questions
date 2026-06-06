import java.util.*;
public class Main{
    public static void main(String args[])
    {
        int a[]={4,6,2,3,8,9};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.print(min);
    }
}

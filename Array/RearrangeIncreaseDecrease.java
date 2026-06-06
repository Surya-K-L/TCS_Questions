import java.util.*;
public class RearrangeIncreaseDecrease{
    public static void main(String args[])
    {
        int a[]={4,2,8,6,15,5,9,20};
        Arrays.sort(a);
        for(int i=0;i<a.length/2;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=a.length-1;i>=a.length/2;i--)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}

import java.util.*;
public class MedianOfArray{
    public static void main(String args[])
    {
        int a[]={2,5,1,7};
        Arrays.sort(a);
        if(a.length%2==1)
        {
            System.out.print(a[(a.length/2)]);
        }
        else
        {
            int t=a[a.length/2];
            int p=a[(a.length/2)-1];
            System.out.print((float)(t+p)/2);
        }
    }
}

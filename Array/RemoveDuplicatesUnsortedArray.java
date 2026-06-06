import java.util.*;
public class RemoveDuplicatesUnsortedArray{
    public static void main(String args[])
    {
        int a[]={3,2,4,6,3,4,7,1};
        LinkedHashSet<Integer>al=new LinkedHashSet<>();
        for(int n:a)
        {
            al.add(n);
        }
        for(int p:al)
        {
            System.out.print(p+" ");
        }
    }
}

import java.util.*;
public class RemoveDuplicatesFromSortedArray{
    public static void main(String args[])
    {
        int a[]={1,2,2,2,3,4,4,5,6,7,7};
        int i=0;
        for(int j=1;j<a.length;j++)
        {
            if(a[i]!=a[j])
            {
                i++;
                a[i]=a[j];
            }
        }
        int uc=i+1;
        for(int k=0;k<uc;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}

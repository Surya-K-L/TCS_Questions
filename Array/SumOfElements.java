import java.util.*;
public class SumOfElements{
    public static void main(String args[])
    {
        int a[]={4,12,8,6,15,5,9,20};
        int sum=0;
        for(int num:a)
        {
            sum+=num;
        }
        System.out.print(sum);
    }
}

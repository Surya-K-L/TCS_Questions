import java.util.*;
public class PerfectNumberOrNot{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(isPerfectNumber(n)?"PerfectNumber":"Not a PerfectNumber");
    }
    public static boolean isPerfectNumber(int n)
    {
        int sum=0,t=n;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==t)
        {
            return true;
        }
        return false;
    }
}

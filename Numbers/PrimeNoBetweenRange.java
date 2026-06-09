import java.util.*;
public class PrimeNoBetweenRange{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=n;i<=k;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}

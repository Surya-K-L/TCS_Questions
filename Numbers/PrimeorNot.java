import java.util.*;
public class PrimeorNot{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print("Not a Prime Number");
                s=1;
                break;
            }
        }
        if(s==0)
        {
            System.out.print("Prime Number");
        }
    }
}

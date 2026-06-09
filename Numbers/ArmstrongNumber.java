import java.util.*;
public class ArmstrongNumber{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(isArm(n)?"Armstrong Number":"Not a Armstrong Number");
    }
    public static boolean isArm(int n)
    {
        int t=n;
        int s=0;
        while(n>0)
        {
            int p=n%10;
            int k=p*p*p;
            s=s+k;
            n/=10;
        }
        if(s==t)
        { 
            return true;
        }
        return false;
    }
}

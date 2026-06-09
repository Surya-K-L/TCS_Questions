import java.util.*;
public class AllPalindromeNumbers{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(isPalindrome(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPalindrome(int n)
    {
        int t=n,s=0;
        while(n>0)
        {
            int k=n%10;
            s=s*10+k;
            n=n/10;
        }
        return s==t;
    }
}

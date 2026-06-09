import java.util.*;
public class Palindrome{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n,s=0;
        while(n>0)
        {
            int k=n%10;
            s=s*10+k;
            n=n/10;
        }
        System.out.print(s==t?"Palindrome":"Not a Palindrome");
    }
}

import java.util.*;
public class Palindrome{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a="madam";
        int s=0;
        int e=a.length()-1;
        while(s<e)
        {
            if(a.charAt(s)==a.charAt(e))
            {
                s++;
                e--;
            }
            else
            {
                System.out.print("Not a Palindrome");
                return;
            }
        }
        System.out.print("Palindrome");
    }
}

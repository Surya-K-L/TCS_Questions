import java.util.*;
public class RemoveVowels{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        a=a.replaceAll("[aeiouAEIOU]","");
        System.out.print(a);
    }
}

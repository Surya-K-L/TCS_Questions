import java.util.*;
public class RemoveCharactersExceptAlpha{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().trim();
        a=a.replaceAll("[^a-zA-Z]","");
        System.out.print(a);
    }
}

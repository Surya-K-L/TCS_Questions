import java.util.*;
public class RemoveSpaces{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().trim();
        a=a.replaceAll(" ","");
        System.out.print(a);
    }
}

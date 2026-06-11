import java.util.*;
public class RemoveBrackets{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().trim();
        String p="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!='('&&a.charAt(i)!=')')
            {
                p=p+""+a.charAt(i);
            }
        }
        System.out.print(p);
    }
}

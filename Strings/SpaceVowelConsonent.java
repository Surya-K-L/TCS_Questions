import java.util.*;
public class SpaceVowelConsonent{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a="My name is Surya ";
        int s=0,v=0,c=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                s++;
            }
            else if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='O'||a.charAt(i)=='U')
            {
                v++;
            }
            else
            {
                c++;
            }
        }
        System.out.print(s+" "+v+" "+c);
    }
}

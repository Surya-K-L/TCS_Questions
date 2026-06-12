import java.util.*;
public class FirstLastLetterUpperCase{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().toLowerCase().split(" ");
        for(String p:a)
        {
            for(int i=0;i<p.length();i++)
            {
                if(i==0||i==p.length()-1)
                {
                    System.out.print(Character.toUpperCase(p.charAt(i)));
                }
                else
                {
                    System.out.print(p.charAt(i));
                }
            }
            System.out.print(" ");
        }
    }
}

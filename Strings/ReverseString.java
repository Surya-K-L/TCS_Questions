import java.util.*;
public class ReverseString{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int s=0;
        int l=a.length()-1;
        char b[]=a.toCharArray();
        while(s<l)
        {
            char t=b[s];
            b[s]=b[l];
            b[l]=t;
            s++;
            l--;
        }
        for(char p:b)
        {
            System.out.print(p);
        }
    }
}

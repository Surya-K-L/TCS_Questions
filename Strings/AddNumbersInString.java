import java.util.*;
public class AddNumbersInString{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().replaceAll("[^0-9]"," ").replaceAll("\\s+"," ").trim().split(" ");
        int sum=0;
        for(String p:a)
        {
            int k=Integer.parseInt(p);
            sum+=k;
        }
        System.out.print(sum);
    }
}

import java.util.*;
public class CountFrequencyOfCharacter{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        TreeMap<Character,Integer>map=new TreeMap<>();
        for(int i=0;i<a.length();i++)
        {
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
        }
        System.out.print(map);
    }
}

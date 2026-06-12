import java.util.*;
public class NonRepetingCharacter{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<a.length();i++)
        {
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
        }
        map.forEach((key,value)->{
            if(value==1)
            {
                System.out.print(key+" ");
            }
        });
    }
}

import java.util.*;
public class FrequencyOfEachElement{
    public static void main(String args[])
    {
        int a[]={4,6,2,4,3,8,6,9,2};
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int num:a)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        map.forEach((key,value)->{
            System.out.println(key+" "+value);
        });
    }
}

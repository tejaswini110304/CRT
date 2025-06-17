import java.util.*;
public class Hashmap{
    public static void main(String args[]){
        Hashmap<Integer,String> hm1=new Hashmap<>();
        Hashmap<Integer,String> hm2=new Hashmap<Integer,String>();
        hm1.put(1,"One");
        hm1.put(2,"Two");
        hm1.put(3,"Three");
        hm2.put(4,"Four");
        hm2.put(5,"Five");
        hm2.put(6,"Six");
        System.out.println(hm1);
        System.out.println(hm2);
    }
}

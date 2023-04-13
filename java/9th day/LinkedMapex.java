import java.util.*;
public class LinkedMapex{
public static void main(String args[]){
LinkedHashMap<Integer, String> hmap = new LinkedHashMap<>();

hmap.put(101, "Divya");
hmap.put(105, "Ganesh");
hmap.put(111, "Shiva");
hmap.put(120, "Daksha");

Set set = hmap.entrySet();
Iterator iterator = set.iterator();
while(iterator.hasNext()){
Map.Entry m = (Map.Entry)iterator.next();
System.out.print("Key is: "+ m.getKey() + " & Value is: ");
System.out.println(m.getValue());
}
}
}
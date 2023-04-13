import java.util.*;
public class HashMapex{
public static void main(String args[]){
HashMap<Integer, String> hmap = new HashMap<>();

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


import java.util.*;

public class HashExa{
public static void main(String args[]){
LinkedHashSet<Integer> set=new LinkedHashSet<>();
set.add(5);
set.add(10);
set.add(15);
set.add(20);
set.remove(25);

Iterator<Integer> it=set.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
}






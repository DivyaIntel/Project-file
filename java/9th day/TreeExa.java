import java.util.Queue;
import java.util.*;

public class TreeExa 
{
public static void main(String args[]){
Queue<Integer> set=new LinkedList<>();
set.add(5);
set.add(10);
set.add(15);
set.add(20);
set.add(25);

Iterator<Integer> it=set.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
}

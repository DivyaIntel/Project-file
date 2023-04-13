import java.util.*;

class ListExample{
public static void main(String args[])
{
ArrayList<String> arrList=new ArrayList<>();
arrList.add("Cricket");
arrList.add("Hockey");
arrList.add(1, "BasketBall"); 

System.out.println("ArrayList Elements:");
for(String str:arrList)
System.out.println(str);
}
}
import java.util.*;

public class Stac{
public static void main(String args[]){
Stack<String> stack = new Stack<>();
	stack.push("Chaitanya");
	stack.push("Ajeet");
	stack.push("Hari");
	stack.pop();
	stack.push("Steve");
	stack.push("Carl");
	stack.pop();
System.out.println("Stack elements:");
	for(String str: stack)
{
System.out.println(stack);
}
System.out.println(stack.peek());
}
}



import java.io.*;
class fullstack{
	int num;
	String name;
	fullstack()
{
 	System.out.println("Constructor called");
}
}
class RS{
	public static void main(String[] args)
{
	fullstack obj1=new fullstack();
	System.out.println(obj1.name);
	System.out.println(obj1.num);
}
}

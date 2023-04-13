import java.util.Scanner;
public class Ifelse
{
public static void main(String agrs[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the Name:");
String a=obj.next();
if(a.equals("Divya"))
{
System.out.println("Name found of Divya");
}
else if(a.equals("Sindhu"))
{
System.out.println("Name found of Sindhu");
}
else if(a.equals("Arun"))
{
System.out.println("Name found of Arun");
}
else
{
System.out.println("Name not match to the List");
}
}
}
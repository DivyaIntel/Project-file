import java.util.Scanner;
public class Loops
{
public static void main(String agrs[])
{
int a[]= new int[5];
Scanner obj = new Scanner(System.in);
for (int i=0; i<5; i++)
{
System.out.println("Enter the values of array");
a[i]=obj.nextInt();
}
for(int i=0; i<5; i++)
{
System.out.println("The Values of Array is: "+a[i]);
}
}
}
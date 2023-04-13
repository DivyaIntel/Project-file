import java.util.Scanner;
public class Foreach
{
  public static void main(String agrs[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<arr.length;i++)
{
System.out.println("Enter the array values:");
arr[i]=sc.nextInt();
}
for(int i:arr)
{
System.out.println(i);
}
}
}
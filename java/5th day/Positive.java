import java.util.*;
public class Positive
{
public static void main (String[]args)
  {
    int num;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the Number :");
    num=obj.nextInt();
    if (num >= 1)
  {
    System.out.println ("The number is positive : "+num);
 }
    else if (num<= 1)
{
   System.out.println ("The number is negative : " +num);
  }
}
}
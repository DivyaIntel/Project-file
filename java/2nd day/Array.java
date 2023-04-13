import java.util.Scanner;
public class Array
{
public static void main(String agrs[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Tamil Mark:");
int Tamil=sc.nextInt();
System.out.println("Enter English Mark:");
int English=sc.nextInt();
System.out.println("Enter Maths Mark:");
int Maths=sc.nextInt();
int Total=Tamil+English+Maths;
System.out.println("Total Marks is = "+Total);
if(Total>105)
{
System.out.println("Pass");
}
else
{
System.out.println("Fail");
}
}
}
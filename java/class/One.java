import java.util.*;


class One
{
      public static void main(String args[])
{
a=2500;
b=2000;
c=4000;
      int a;
      int b;
      int c;
      int temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a:");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
if (a>b)
   {
     temp=a;
   }
    else
   {
    temp=b;
   }
    if(c>temp)
   {
    System.out.println("Biggest is " + c);
    }
else
{
System.out.println("Biggest is " + temp);
    }
}
}




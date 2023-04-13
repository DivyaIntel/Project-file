import java.util.*;

public class Polymorphism
{
void add()
{
int a=5, b=10;
int c=a+b;
System.out.println(c);
}

void add(int a, double b)
{
double e=a+b;
System.out.print(e);
}

void sub()
{
int a=5, b=10;
int c=a-b;
System.out.println(c);
}

void sub()
{


void mul()
{
int a=5, b=10;
int c=a*b;
System.out.println(c);
}

void div()
{
int a=5, b=10;
int c=a/b;
System.out.println(c);
}

public static void main(String []args)
{
Polymorphism sc=new Polymorphism();
sc.add();
sc.add(20,30);
}
}





















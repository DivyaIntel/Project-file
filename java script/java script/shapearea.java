import java.util.*;

interface Area
{
public void Square();
public void Circle();
public void Rectangle();
public void Triangle();
}
 
interface CircumFerence
{
public static void Square()
{
   double a = 12.20, f;
   f = 4 * a;
   System.out.println(f);
}
    public static void Display()
{
    System.out.println("\n");
}
}
class shapeArea implements Area, CircumFerence
{
public void Square()
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the radius of the circle");
double r =kb.nextInt();
double areaOfCircle=3.142*r*r;
System.out.println("Area of the circle is"+areaOfCircle);
}

public void Square(){
Scanner kb2 = new Scanner(System.in);
System.out.println("Enter the length of the side of  the square");
double s = kb2.nextInt();
double areaOfSquare = s*s;
System.out.println("Area of the square is"+areaOfSquare);
}

public void Rectangle(){
Scanner kb3 = new Scanner(System.in);
System.out.println("Enter the length of the Rectangle");
double l=kb3.nextInt();
System.out.println("Enter the breadth of the Rectangle");
double b = kb3.nextInt();
double areaOfRectangle = l *b;
System.out.println("Area of the Rectangle is"+areaOfRectangle);
}

public void Triangle(){
Scanner kb4 = new Scanner(System.in);
System.out.println("Enter the base of the Triangle");
double base = kb4.nextInt();
System.out.println("Enter the heigth of the Triangle");
double h = kb4.nextInt();
double areaOfTriangle = 0.5*base*h;
System.out.println("Area of the Triangle is "+areaOfTriangle);
}

public static void main(String[] args){
shapeArea geometry = new shapeArea();
geometry.Cricle();
geometry.Square();
geometry.Rectangle();
geometry.Triangle();
}
}














































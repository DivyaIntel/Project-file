import java.util.*;

class calculator
{

 public static void main(String args[]) 
{
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = in.nextInt();
        System.out.println("Enter second number: ");
        b = in.nextInt();
        System.out.println("Enter operator: ");
        char op = in.next().charAt(0);
        int r = 0;
        switch (op) {
       case '+':
            r = a + b;
            System.out.println(a + " + " + b + " = " + r);
            break;
            
        case '-':
            r = a - b;
            System.out.println(a + " - " + b + " = " + r);
            break;
            
         case '*':
            r = a * b;
            System.out.println(a + " * " + b + " = " + r);
            break;
            
         case '/':
            r = a / b;
            System.out.println(a + " / " + b + " = " + r);
            break;
            
           default:
               System.out.println("INVALID OPERATOR");
        }
    }
}
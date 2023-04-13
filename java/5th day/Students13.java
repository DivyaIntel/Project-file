import java.util.*;

class Students13
{
    String name;
    int age;
    String qualification ;
    int assessmentMarks;
public void display()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Student Rollno : ");
  
   int student=sc.nextInt();
switch (student)
{
case 1:
    name="Divya";
    age = 30;
    qualification = "Bsc CS";
    assessmentMarks = 100;
    break;
case 2:
    name ="Sindhu";
    age = 28;
    qualification = "Msc";
     assessmentMarks = 50;
     break;
default:
    System.out.println("student no is not present in list");
    break;
 }
}

class FullStack extends Students13 {
    public void jobRole() {
        System.out.prin
tln("\t" + name + " works as a Full Stack Developer");
    }
}

class WebDevelopment extends Fullstack {
    public void salary() {
        int salary = assessmentMarks *1000;
        System.out.println("\t" + name + "salary is" + salary);
    }
}

public class inherittask1{
    public static void main(String[] args) {
        WebDevelopment web= new WebDevelopment();
        web.display();
        web.jobRole();
        web.salary();
    }
}

    








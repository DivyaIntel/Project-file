
class  BRread

public static void main(string args);
{
char C;
BufferedRader br = new BufferedReader
                                   (new InputStreamr (System.in));
System.out.println("Enter character 'q' to quit");

try{
do{
    c = (char) br.read();
    System.out.println(c);
}
while (c!='q');
}
catch(Exception e)
{
System.out.println(r);
e.printStackTrance();
}
}
}






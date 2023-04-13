class Bank
{
private int account;
private String name;

public int getAccount()
{
return account;
}

public String getName()
{
return name;
}

public void setAccount(int acc)
{
this.account=acc;
}

public void setName(String cha)
{
this.name=cha;
}
}

class Testencap
{
public static void main(String []args)
{
Bank obj=new Bank();
obj.setAccount(12345);
obj.setName("Divya");
System.out.println("The Account is :"+obj.getAccount());
System.out.println("The Name is :"+obj.getName());
}
}

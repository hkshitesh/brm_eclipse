package pkg1;
public class Lab3_Ex1 {	
	String name;
	int empid;
	int sal;
	Lab3_Ex1()
	{
		name="Amit";
		empid=101;
		sal=1000;
	}
	Lab3_Ex1(String s1, int id, int s)
	{
		name=s1;
		empid=id;
		sal=s;
	}
	public void display()
	{
		System.out.println("Name is "+name+"ID is "+empid+"sal is "+sal);
	}
	public static void main(String[] args) {

		Lab3_Ex1 ob1 = new Lab3_Ex1();
		ob1.display();
		Lab3_Ex1 ob2 = new Lab3_Ex1("Kapil",102,2000);
		ob2.display();
	}
}

class Employee
{
	int id;
	String name;

	void setData()
	{
		id=101;
		name="nivi";
	}
	void display()
	{
		System.out.println("ID is "+id);
		System.out.println("Name is "+name);
	}
}
class EmpInfo
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		e1.setData();
		e1.display();
	}
}






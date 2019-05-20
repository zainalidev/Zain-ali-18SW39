class Person
{
	private String name;
	private String address;
	Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String toString()
	{
		return "Person[name="+name+",address="+address+"]";
	}
}
class Student extends Person
{
	private String program;
	private int year;
	private double fee;
	Student(String name,String address,String program,int year,double fee)
	{
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public void setProgram(String program)
	{
		this.program=program;
	}
	public String getProgram()
	{
		return program;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	public double getFee()
	{
		return fee;
	}
	public String toString()
	{
		return "Student["+super.toString()+",program="+program+",year="+year+",fee="+fee+"]";
	}
}
class Staff extends Person
{
	private String school;
	private double pay;
	Staff(String name,String address,String school,double pay)
	{
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	public void setSchool(String school)
	{
		this.school=school;
	}
	public String getSchool()
	{
		return school;
	}
	public void setPay(double pay)
	{
		this.pay=pay;
	}
	public double getPay()
	{
		return pay;
	}
	public String toString()
	{
		return "staff["+super.toString()+",school="+school+",pay="+pay+"]";
	}
}
class Task2
{
	public static void main(String[] args) 
	{
		Student std=new Student("abdul jabbar","MUET hostel","BE",2021,1600);
		Staff st=new Staff("abdul jabbar","MUET hostel","Govt: School kamber",0.0);
		System.out.println(std);
		System.out.println(st);
	}
}
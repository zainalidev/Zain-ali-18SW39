    
class Student{
	private String name;
	private int age;
	private String address;
	public Student(){
		name="unknown";
		age=0;
		address="not available";
	}
	public void setInfo(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void print(){
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Address="+address);
	}
}
class Task5{
	public static void main(String args[]){
		Student s1=new Student();
		s1.setInfo("Ahmed",15);
		Student s2=new Student();
		s2.setInfo("Raja",17);
		Student s3=new Student();
		s3.setInfo("Zain",19,"Hyderabad");
		Student s4=new Student();
		s4.setInfo("Ali",18,"Jamshoro");
		Student s5=new Student();
		s5.setInfo("Ahmed",20,"Larkana");
		Student s6=new Student();
		Student s7=new Student();
		Student s8=new Student();
		Student s9=new Student();
		Student s10=new Student();
		Student students[]={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		for(int i=0;i<students.length;i++){
			students[i].print();
			System.out.println();
		}

	}
}
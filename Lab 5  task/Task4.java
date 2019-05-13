class Student{
	String name;
	int rollnum;
	int age;
	public Student(String name,int rollnum,int age){
		this.name=name;
		this.rollnum=rollnum;
		this.age=age;
	}
	public void display(){
		System.out.println("Name : "+name+"\nRoll Number : "+rollnum+"\nAge : "+age);
	}
}
class Task4{
	public static void main(String[] args) {
		Student s=new Student("Zain",39,18);
		s.display();
	}
}
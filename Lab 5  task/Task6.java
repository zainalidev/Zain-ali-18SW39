class Combine{
	Student s1;
	Marksheet m1;
	Combine(Student s1,Marksheet m1){
		this.s1=s1;
		this.m1=m1;
	}
	void createStudentResult(){
		s1.showDetails();
		m1.showDetails();
	}
}
class Student{
	String stdname;
	String rollno;
	String department;
	int age;
	Student(String stdname,String rollno,String department,int age){
		this.stdname=stdname;
		this.rollno=rollno;
		this.department=department;
		this.age=age;
	}
	void setDetails(String stdname,String rollno,String department,int age){
		this.stdname=stdname;
		this.rollno=rollno;
		this.department=department;
		this.age=age;
	}
	void showDetails(){
		System.out.println("Student Name:"+stdname+"\nRoll No:"+rollno+"\nDepartment:"+department+"\nAge:"+age);
	}
}
class Marksheet{
	int cp;
	int eng;
	int dcld;
	int tot;
	int obt;
	float percentage;
	void setDetails(int cp,int eng,int dcld,int tot){
		this.cp=cp;
		this.eng=eng;
		this.dcld=dcld;
		this.tot=tot;
	}
	void showDetails(){
		obt=cp+eng+dcld;
		System.out.println("Marks in CP:"+cp);
		System.out.println("Marks in Eng:"+eng);
		System.out.println("Marks in DCLD:"+dcld);
		System.out.println("Total Obtained Marks"+obt);
		System.out.println("Total Marks:"+tot);
		System.out.println("Your Percentage is:"+calculatePercentage());
		System.out.println("Your Grade is:"+grade());
	}
	float calculatePercentage(){
		obt=cp+eng+dcld;
		percentage=(obt*100/tot);
		return percentage;
	}
	char grade(){
		if(percentage>80)
			return 'A';
		else if(percentage>=70 && percentage<80)
			return 'B';
		else if(percentage>=60 && percentage<70)
			return 'C';
		else if(percentage>=50 && percentage<60)
			return 'D';
		else if(percentage>=40 && percentage<50)
			return 'E';
		else
			return 'F';
	}
}
class Task6{
	public static void main(String args[]){
		Student s1=new Student("Zain Ali","18SW39","Software Engineering",17);
		Marksheet m1=new Marksheet();
		m1.setDetails(90,90,90,300);
		Combine c1=new Combine(s1,m1);
		c1.createStudentResult();
	}
}
class Dog{
	String name;
	int age;
	String breed;
	public void setDetails(String n,int a,String b){
		name=n;
		age=a;
		breed=b;
	}
	void showDetails(){
			System.out.println("Name="+name+"\nage="+age+"\nbreed="+breed);
	}
}
class First{
	public static void main(String args[]){
		Dog p=new Dog();
		p.setDetails("Tomy",2,"A1");
		p.showDetails();
	}
}
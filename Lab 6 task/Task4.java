class Task4{
	public void area(int l){
		System.out.println("Area of Square="+(l*l));
	}
	public void area(int l,int w){
		System.out.println("Area of Rectangle="+(l*w));
	}
	public static void main(String args[]){
		Task4 t4=new Task4();
		t4.area(5);
		t4.area(3,5);
	}
}
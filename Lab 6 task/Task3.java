class Task3{
	public void print(int number,char character){
		System.out.println("Number="+number+" character="+character);
	}
	public void print(char character,int number){
		System.out.println("Number="+number+" character="+character);
	}
	public static void main(String args[]){
		Task3 t3=new Task3();
		t3.print(1,'a');
		t3.print('z',54); 
	}
}
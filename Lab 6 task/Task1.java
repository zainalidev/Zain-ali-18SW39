class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;

	}
	public String getName(){
		return name;
	}
    public String setEmail(String email){
    	this.email=email;
    	return this.email;
    }
    public String getEmail(){
    	return email;
    }
    public char getGender(){
    	return gender;
    }
    public String toString(){
    	return ("Author name = "+this.name+" ,email="+this.email+" ,gender="+this.gender);
    }
}
    class Task1{
    	public static void main(String[] args) {
    		Author a=new Author("Zain Ali","zainalidev@gmail.com",'m');
    	System.out.println("Name = "+a.getName());
    	System.out.println("Email = "+a.getEmail());
    	System.out.println(a.setEmail("zainalidev@gmail.com"));
    	System.out.println("Gender = "+a.getGender());
    	System.out.println(a.toString());
    	}
}







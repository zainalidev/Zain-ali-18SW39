class Marksheet
{
	public static void main(String args[])
	{
		String name="Zain";
        long totalmarks=500;
        int obmarks=400;
        float percentage=obmarks*100/totalmarks;
        char grade='A';
        boolean b=percentage>33;
        System.out.println("Name = "+name);
        System.out.println("Total Marks = "+totalmarks);
        System.out.println("Obtained Marks = "+obmarks);
        System.out.println("Percentage = "+percentage);
        System.out.println("Grade = "+grade);

        if(b){
        	System.out.println("Pass");

        }else{ 
         System.out.println("Fail");
     }
	}
}
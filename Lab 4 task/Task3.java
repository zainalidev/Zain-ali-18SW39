import java.util.Scanner;
class sum {

    public static void main(String[] args) {
     int sum=0;
     Scanner sc=new Scanner(System.in);
      System.out.print("Enter a Number : ");
      int num=sc.nextInt();
      for (int i=1;i<=num;i++) {
            sum=sum+i;
        }  
     System.out.print("Total Sum : "+sum);
    }
}

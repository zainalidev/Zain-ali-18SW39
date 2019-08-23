import java.util.*;
interface AdvancedArithmetic
{
    public int sumOfFactors(int n);
}
class SumOfFactors implements AdvancedArithmetic
{
    public int sumOfFactors(int n)
    {
        int i=1;
        int sum=0;
        while(i<=n)
        {
            if(n%i==0)
            sum=sum+i;
            i++;
        }
        return sum;
    }

    public static void main(String args[])
    {
        SumOfFactors f=new SumOfFactors();
        Scanner sc=new Scanner(System.in);
        System.out.println("Plase Enter a Number");
        int n=sc.nextInt();
        System.out.println("Sum of Factors of  "+n+"  are: "+f.sumOfFactors(n));
    }
}
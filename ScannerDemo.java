import java.util.Scanner;
class ScannerDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int  num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum is"+sum);
    }    
}

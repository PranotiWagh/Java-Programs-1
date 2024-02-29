import java.util.Scanner;
class ScannerDemo2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextString(); 
        System.out.println("enter age");
        int age=sc.nextInt();
        System.out.println("enter Salary");
        double sal=sc.nextDouble();
        System.out.println("enter price");
        float price=sc.nextFloat();
        System.out.println("enter num1");
        short num1=sc.nextShort();
        System.out.println("enter num2");
        byte num2=sc.nextByte();
        System.out.println("enter gender");
        String gender=sc.nextLine();
        System.out.println("enter cno");
        Long cno=sc.nextLong();
        System.out.println("enter boolean");
        boolean data=sc.nextBoolean();  
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(name);
        System.out.println(age);
        System.out.println(sal);
        System.out.println(price);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(gender);
        System.out.println(cno);
        System.out.println(data);
            
    }
}
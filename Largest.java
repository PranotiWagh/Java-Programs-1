import java.util.Scanner;
class Largest
{
    public static void FindLargest()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ente 2 numbers");
        int num1=s.nextInt();
        int num2=s.nextInt();
        
        if(num1 <=num2)
        {
            System.out.println("num1 is greater");
        }
        else
        {
            System.out.println("num2 is greater");
        }

    }
    public static void main(String args[])
    {
        FindLargest();
    }
}
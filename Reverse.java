import java.util.Scanner;
class Reverse
{
    public static void reverse()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        int number=sc.nextInt();
        int temp=number;
        int reverse=0;
        while(number!=0)
        {
            int last_digit=number%10;
            reverse=reverse*10+last_digit;
            number=number/10;
        }
        if(reverse==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
        public static void main(String args[])
        {
            reverse();
        }
    }
}
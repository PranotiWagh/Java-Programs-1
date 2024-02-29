import java.util.*;
class NestedIfElseDemo
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        if(n%2==0)
        {
            System.out.println("even number");
            if(n%6==0)
            {
                System.out.println("Divisible by 6");
            }
            else
            {
                System.out.println("not divisible");
            }
        }
        else
        {
            System.out.println("odd number");
            if(n%3==0)
            {
                System.out.println("Divisible by 3");
            }
            else
            {
                System.out.println("not divisible by 3");
            }
        }
    }


}
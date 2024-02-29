import java.util.*;
class MultiplicationTable
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter starting number");
        int n=sc.nextInt();
        System.out.println("enter ending number");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(i%3==0)
            {
                System.out.println(i+ " Divisible by 3");
            }
            else if(i%5==0)
            {
                System.out.println(i+ " Divisible by 5");

            }
        }
    }
}
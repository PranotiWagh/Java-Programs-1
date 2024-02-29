import java.util.*;
class WhileLoopDemo2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the starting number");
        int start=s.nextInt();
        System.out.println("Enter the end number");
        int end=s.nextInt();
        int i=start;
        while(i<=end)
        {
            System.out.println(i+" ");
            i++;
        }
    }
}
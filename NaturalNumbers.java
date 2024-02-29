import java.util.*;
class NaturalNumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting unmber");
        int start=sc.nextInt();
        System.out.println("enter end number");
        int end=sc.nextInt();
        int i=start;
        for(i=start;i<=end;i++)
        {
            System.out.println(i);
        }
        
    }
}
import java.util.Scanner;
class FindSum
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
            int addition=addition+i;
        }
        System.out.println(addition);
    }
}
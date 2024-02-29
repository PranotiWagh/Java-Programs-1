import java.util.Scanner;
class NestedLoop
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in); 
        System.out.println("enter number of weeks");
        int weeks=s.nextInt();
        System.out.println("enter number of days");
        int days=s.nextInt();
        int i=1;
        while(i<=weeks)
        {
            System.out.println("Week is "+i);
            for(int j=1;j<=days;j++)
            {
                System.out.println(j);
            }
            i++;
        }
    }
    
}
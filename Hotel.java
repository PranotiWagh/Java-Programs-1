import java.util.Scanner;
class Hotel
{   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        System.out.println(" Idali\n Dosa\n RiceBath\n Vada\n");
        String choice=sc.next();
        switch(choice)
        {
            case "Idali":
            {
                System.out.println("Idali is selected");
            }
            break;

            case "Dosa":
            {
                System.out.println("Dosa is selected");
            }
            break;
            case "Rice Bath":
            {
                System.out.println("Rice Bath is selected");
            }
            break;
            case "Vada":
            {
                System.out.println("Vada is selected");
            }
            break; 
        }
    }
}
import java.util.Scanner;
class Pen
{
    String color;
    String brand;
    double price;
    Pen(String color,String  brand,double price)
    {
        this.color=color;
        this.brand=brand;
        this.price=price;
    }
    public void display()
    {
        System.out.println("pen color is"+color);
        System.out.println("pen brand is"+brand);
        System.out.println("pen price is"+price);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter pen color");
        String color=sc.next();
        System.out.println("enter pen brand");
        String brand=sc.next();
        System.out.println("enter pen price");
        double price=sc.nextDouble();
        System.out.println("===================Pen 1 details=====================");
        Pen p1=new Pen(color,brand,price);
        p1.display();

        System.out.println("enter pen color");
        String color1=sc.next();
        System.out.println("enter pen brand");
        String brand1=sc.next();
        System.out.println("enter pen price");
        double price1=sc.nextDouble();
        System.out.println("===================Pen 2 details=====================");
        Pen p2=new Pen(color,brand,price);
        p2.display();
    }
    
}
class Mobile2
{
    String brand="samsung";
    String color="blue";
    double price;
    {
        System.out.println("non static block");
    }
    public void display()
    {
        System.out.println("brand is"+brand);
        System.out.println("coior is "+color);
        System.out.println("price is"+price);
    }
    public static void main(String args[])
    {
        Mobile2 m1=new Mobile2();
        m1.display();
        Mobile2 m2= new Mobile2();
        m2.brand="nokia";
        m2.color="black";
        m2.price=3456.45;
        m2.display();
        Mobile2 m3=new Mobile2();
        m3.display();
    }
}
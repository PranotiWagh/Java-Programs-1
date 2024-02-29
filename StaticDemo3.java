class StaticDemo3
{
    static int a=10;
    static int b;
    static 
    {
        System.out.println("Static block");
        b=a;
    }
    public static void main(String args[])
    {
        System.out.println("from main");
        System.out.println("value of a"+a);
        System.out.println("value ob b"+b);
    }
}
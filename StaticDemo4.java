class StaticDemo4
{
    static int a=m1();
    static
    {
        System.out.println("static block");
    }
    public static int m1()
    {
        System.out.println("from m1()");
        return 20;
    }
    public static void main(Srting args[])
    {
        System.out.println("value of a is"+a);
        System.out.println("from main");
    }
}
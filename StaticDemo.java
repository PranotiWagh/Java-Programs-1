class StaticDemo
{
    static int b;
    static int a=10;
    public static void m1()
    {
        System.out.println("Static block executed");
        System.out.println(a);
    
    }
    static 
    {
        System.out.println("static block executed");
        System.out.println(a);
    }
    public static void main(String args[])
    {
        System.out.println("main start");
        m1();
        System.out.println("main ends");
    }
}

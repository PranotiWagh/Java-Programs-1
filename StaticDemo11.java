class StaticDemo11
{
    static int b=10;
    static{
        System.out.println("Static block");
    }
    public static void main(String args[])
    {
        System.out.println("main start");
        System.out.println(b);
        System.out.println("Main ends");
    }
}
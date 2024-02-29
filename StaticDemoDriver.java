class StaticDemo12
{
    static String c="hello";
    static{
        System.out.println("Static block");
    }
}    
class StaticDemoDriver
{    
    public static void main(String args[])
    {
        System.out.println("main start");
        System.out.println(StaticDemo12.c);
        System.out.println("Main ends");
    }
}
class StaticDemo10
{
    static int a=10;
    static{
        System.out.println("Static block");
    }
    public static void main(String args[])
    {
        System.out.println(a);
    }
}
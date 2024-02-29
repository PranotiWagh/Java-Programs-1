class Method3
{
    public static void sita()
    {
        System.out.println("hii from sita");
    }

    public static void main(String args[])
    {
        System.out.println("main start");
        sita();
        ram();
        System.out.println("main ends");
    }

    public static void ram()
    {
        System.out.println("hii i am ram");
        sita();
    }
}
class Honda
{
    Honda()
    {
        System.out.println("honda executed");
    }
    static
    {
        System.out.println("static block");
    }
    public static void main(String args[])
    {
        Honda h= new Honda();
        System.out.println("main ends");
    }
}
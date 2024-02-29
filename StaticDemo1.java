class StaticDemo1
{
    static int a;
    static int b=10;
    static 
    {
        System.out.println("static block 1");
        System.out.println(a);
    }
    public static void main(String args[])
    {
        System.out.println("main start");
        System.out.println("main ends";)
    }
    static 
    {
        System.out.println("static block 2");
        System.out.println(b);
      
        
    }
}
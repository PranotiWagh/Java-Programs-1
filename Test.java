class Test
{
    {
        System.out.println("non static varible");
    }
    String var1="Seema";
    int var2;
    {
        System.out.println(var2);
    }
    static 
    {
        int a=10;
        System.out.println(a);
    } 
    public static void main(String args[])
    {
        System.out.println("main start");
        Test t1 =new Test();
        Test t2 =new Test();
    }
}
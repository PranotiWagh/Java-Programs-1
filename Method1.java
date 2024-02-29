class Method1
{
    public static void main(String[] args)   
     {
        System.out.println("main start");
        add();
        add();
        add();
        System.out.println("main ends");
    }

    public static void add()
    {
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);
    }
}
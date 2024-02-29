class IncrementOpreator
{
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(b++);
        System.out.println(++b);
        int x= a+ a++ - ++b -a;
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
    }
}
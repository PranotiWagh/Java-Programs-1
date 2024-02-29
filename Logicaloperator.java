class Logicaloperator
{
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        boolean result=(a>b && b>10);
        System.out.println(result);
        System.out.println(a==10 && a!=10);
        System.out.println(a>=b && b<=100);

        System.out.println(10==20 || 45<90);
        System.out.println(a<=5 || b!=a);
        System.out.println(23>=a || 34>=b);
        System.out.println(!result);
        boolean result1=!(a!=10);
        System.out.println(result1);
    }
}

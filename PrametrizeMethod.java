class PrametrizeMethod
{
    /**
     * @param args
     */
    public static void main(String args[])
    {
        System.out.println("main start");
        add(10,20);
        add(23,56);
        display("seema",'f');
        display("kartika",'f');
        display1(3.4f,4.6,10);
        display1(6.7f,4.6,10);
        System.out.println("main ends");
    }

    public static void add(double a,int b)
    {
        System.out.println(a+b);
    }

    public static void display(String name,char gender)
    {
        System.out.println("the name is"+name);
        System.out.println("the gender is"+gender);
    }

    /**
     * @param f
     * @param d
     * @param i
     */
    public static void display1(float f,double d,int i)
    {
        System.out.println(f+d+i);
    }
}


    
    


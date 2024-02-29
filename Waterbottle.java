class Waterbottle
{
     public static void main(String args[])
    {
        Waterbottle w= new Waterbottle();
        w.printAttributes();
       // w.setAttributes();
        w.printAttributes();
        Waterbottle w1= new Waterbottle();
        w1.printAttributes();
       // w1.setAttributes();
        w1.printAttributes();
    }

    static String brand="Milton";
    String color;
    int height;
    int width;
    int capacity;
    {
        System.out.println(brand);
        System.out.println("non static block");
    }
    static
    {
        System.out.println("static block");
    }

    public void setAttributes(int height,int width,int capacity,String color)
    {
        
        this.height=height;
        this.width=width;
        this.capacity=capacity;
        this.color=color;
    }
        
    public void printAttributes()
    {
        System.out.println(height);
        System.out.println(width);
        System.out.println(capacity);
        System.out.println(color);
    }
    
   
    
}
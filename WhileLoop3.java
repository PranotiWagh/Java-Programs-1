class WhileLoop3
{
    public static int sum()
    {
        int sum=0;
        int i=0;
        while(i<=10)
        {
            sum=sum+i;
            i++;
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println(sum());
    }
}
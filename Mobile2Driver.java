
public class Mobile2Driver
{
    public static void main(String args[])
    {
	    MobilePurchase m2=new MobilePurchase();
	    m2.getSim();
        SimCard s=new SimCard();
	   // m2.insertSim(new SimCard());
        //m2.insertSim();
	    m2.removeSim();
    }
}

class SimCard
{
	int sim_no=123;
	String service_provider="airtel";
}

class MobilePurchase
{
	String brand="oneplus";
	int ram=123;
	int price=1234;
	Sim s;
	
	public void  insertSim(Sim s)
	{
		this.s=s;
		System.out.println("sim inserted");
	}
	
	
	public void removeSim()
	{
		this.s=null;
        System.out.println("sim removed");
	}
	public void getSim()
	{
		System.out.println("==========Mobile details==========");
		System.out.println("mobile brand"+brand);
		System.out.println("mobile ram is"+ram);
		System.out.println("mobile price is"+price);
	}

}

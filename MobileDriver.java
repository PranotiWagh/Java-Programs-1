
class MobileDriver
{
	public static void main(String args[])
	{
		Mobile m=new Mobile("oneplus","black",12345);
		System.out.println(m.brand);
		m.mobileDetails();
		m.insertSim(new Sim("airtel",1234,"red"));
		m.s.simDetails();
		m.removeSim();
	}

}
class Mobile 
{
	String brand;
	String color;
	double price;
	Sim s;
	Mobile(String brand, String color,double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public void insertSim(Sim s)//helper method
	{
		this.s=s;
		System.out.println("Sim inserted");
	}
	
	public void mobileDetails()
	{
		System.out.println("==========Mobile Details=============");
		System.out.println("mobile brand"+brand);
		System.out.println("Mobile color"+color);
		System.out.println("Mobile price"+price);
	}
	public void removeSim()
	{
		this.s=null;
		System.out.println("sim removed");
	}
}
class Sim
{
	String sim_name;
	int sim_no;
	String sim_color;
	Sim(String sim_name,int sim_no,String sim_color)
	{
		this.sim_name=sim_name;
		this.sim_no=sim_no;
		this.sim_color=sim_color;
	}
	
	public void simDetails()
	{
		System.out.println("======Sim details=========");
		System.out.println("sim name is"+sim_name);
		System.out.println("sim color is"+sim_color);
		System.out.println("sim no"+sim_no);
	}

}


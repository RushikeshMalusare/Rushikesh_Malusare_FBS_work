class Electricity
{
	int e_id;
	String e_name;
	int unit;
	static Double rpu;

	static{
		rpu=45.4;
	}
	


	void setId(int i)
	{
		this.e_id=i;
	}
	void setName(String nm)
	{
		this.e_name=nm;
	}
	void setUnit(int u)
	{
		this.unit=u;
	}
	
	
	int getId()
	{
		return this.e_id;
	}
	String getName()
	{
		return this.e_name;
	}
	int getUnit()
	{
		return this.unit;
	}
	double getRpu()
	{
		return this.rpu;
	}
	
	Electricity()
	{
		this.e_id=0;
		this.e_name="";
		this.unit=0;
	}
	Electricity(int e_id,String e_name,int unit,double rpu )
	{
		this.e_id=e_id;
		this.e_name=e_name;
		this.unit=unit;
		
	}
	void display()
	{
		System.out.println("Costomer id"+this.e_id);
		System.out.println("Costomer name"+this.e_name);
		System.out.println("Costomer unit"+this.unit);
		System.out.println("Costomer rate of unit"+this.rpu);
	}


	void calBill()
	{
		System.out.println(this.unit*this.rpu);
	}

}//class end here
class Demo
{
	public static void main(String[] a)
	{
		Electricity e1=new Electricity();
		e1.setId(101);
		e1.setName("abc");
		e1.setUnit(23);
		//e1.setRpu(2);
	
		e1.display();
		
	}
}	
class Calculator
{
	
		void Add(int a,int b)
		{
			
			System.out.println("Addition is"+(a+b));
		}
		void Add(int a,double d)
		{
			System.out.println("Addition is"+(a+d));
		}
		void Add(double x,int b)
		{
			System.out.println("Addition is"+(x+b));
		}
		void Add(double d,double x)
		{
			System.out.println("Addition is"+(d+x));
		}
	

		void Sub(int a,int b)
		{
			System.out.println("Substraction is"+(a-b));
		}
		void Sub(int a,double d)
		{
			System.out.println("Substraction is"+(a-d));
		}
		void Sub(double x,int b)
		{
			System.out.println("Substraction is"+(x-b));
		}
		void Sub(double d,double x)
		{
			System.out.println("Substraction is"+(d-x));
		}
	

		void Mul(int a,int b)
		{
			System.out.println("Multiplication  is"+(a*b));
		}
		void Mul(int a,double d)
		{
			System.out.println("Multiplication is"+(a*d));
		}
		void Mul(double x,int b)
		{
			System.out.println("Multiplication is"+(x*b));
		}
		void Mul(double d,double x)
		{
			System.out.println("Multiplication is"+(d*x));
		}

		void Div(int a,int b)
		{
			System.out.println("Division  is"+(a/b));
		}
		void Div(int a,double d)
		{
			System.out.println("Division is"+(a/d));
		}
		void Div(double x,int b)
		{
			System.out.println("Division is"+(x/b));
		}
		void Div(double d,double x)
		{
			System.out.println("Division is"+(d/x));
		}
	
		
}//class end here
class Test
{
	public static void main(String[] args)
	{
		Calculator c=new Calculator();
		int a=10,b=20;
		double d=20.5,x=34.2;
             
		c.Add(a,b);
		c.Add(a,d);
		c.Add(d,b);
		c.Add(d,x);
		

		c.Sub(a,b);
		c.Sub(a,d);
		c.Sub(d,b);
		c.Sub(d,x);
			
		c.Mul(a,b);
		c.Mul(a,d);
		c.Mul(d,b);
		c.Mul(d,x);
		
		c.Div(a,b);
		c.Div(a,d);
		c.Div(d,b);
		c.Div(d,x);
		
	}
}
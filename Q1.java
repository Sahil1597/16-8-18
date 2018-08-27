class sum
{
	public double a,b,sum;
	
	sum(int x,int y)
	{
	a = x;
	b = y;
	}
	
	void calculate()
	{
	sum = a+b;
	}
	
	void show()
	{
	System.out.println("Sum of "+a+" and "+b +" is "+sum);
	}
}

class Q1
{
	public static void main(String x[])
	{
	sum obj = new sum(10,20);
	obj.calculate();
	obj.show();
	}
}
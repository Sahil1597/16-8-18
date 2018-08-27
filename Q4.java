class max
{
	int a,b,c;
	
	max(int x,int y,int z)
	{
	a = x;
	b = y;
	c = z;
	}
	
	void greatest()
	{
		if(a > b && a>c)
		System.out.println(a +" is greatest number");
		
		else if(b > a && b>c)
		System.out.println(b +" is greatest number");
		
		else if(c>a && c>b)
		System.out.println(c +" is greatest number");
		
		else if(a == b && a>c)
		System.out.println(a +" and "+b+" are greatest numbers");
		
		else if(b == c && b>a)
		System.out.println(b +" and "+c+" are greatest number");
		
		else if(c == a && c>b)
		System.out.println(a +" and "+c+" are greatest number");
		
		else if(a == b && b==c && c== a)
		System.out.println(a +","+b+" and "+c+" are greatest number");
	}
}

class Q4
{
	public static void main(String x[])
	{
		max obj = new max(5,10,15);
		max obj1 = new max(15,10,15);
		max obj2 = new max(15,15,15);
		
		obj.greatest();
		obj1.greatest();
		obj2.greatest();
	}
}
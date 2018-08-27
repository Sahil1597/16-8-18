
class prime
{
	int i,count,j,num;
	
	prime(int x)
	{
	num = x; 		
	}
	
	void calculate()
	{
		for(i=1;i<=num;i++)
		{
			if(num%i == 0)
			count++;
			
		}	
	
	}
	
	void show()
	{
		if(count == 2)
		System.out.println(num +" is a prime number");
		else
		System.out.println(num +" is not a prime number");	
	}
}

class Q6
{
	public static void main(String x[])
	{
	prime obj = new prime(197);
	obj.calculate();
	obj.show();
	}
	
}
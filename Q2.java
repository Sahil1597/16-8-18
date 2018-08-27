class leap
{
	public int n;

	leap(int x)
	{
	n = x;
	}
	
	void calculate()
	{
		if((n%4 == 0 && n%100 != 0) || n%400 == 0)
		System.out.println(n +" is leap year ");
		else
		System.out.println(n +" is not a leap year ");
	}
}

class Q2
{
	public static void main(String x[])
	{
	leap obj = new leap(1700);
	obj.calculate();
	}
}
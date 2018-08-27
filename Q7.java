class reverse
{
	int i,rev= 0,temp,num;
	reverse(int x)
	{
	num = x;	
	}
	
	void get()
	{
		temp = num;
		while(num > 0)
		{
		i = num%10;
		rev = rev*10 + i;
		num = num/10;
		}
	}
		
		void show()
		{
			System.out.println("Reverse of "+temp +" is "+rev);
		}
}

class Q7
{
	public static void main(String x[])
	{
	reverse obj = new reverse(12345);
	obj.get();
	obj.show();
	}
}
class pallindrome
{
	int i,rev= 0,temp,num;
	pallindrome(int x)
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
		if(rev == temp)
		System.out.println(temp +" is pallindrome ");
		else
		System.out.println(temp +" is not pallindrome ");	
		}
}

class Q5
{
	public static void main(String x[])
	{
	pallindrome obj = new pallindrome(121);
	obj.get();
	obj.show();
	}
}
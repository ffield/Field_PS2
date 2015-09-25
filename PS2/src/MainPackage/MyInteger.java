package MainPackage;

public class MyInteger {
	
	private int value;

	public int getValue() {
		return value;
	}
	
	private void setValue(int value)
	{
		this.value = value;
	}
	public MyInteger( int value)
	{
		setValue(value);
	}
	
	public boolean isEven()
	{
		if (this.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isEven( int value)
	{
		if ( value % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isEven(MyInteger myInt)
	{
		if (myInt.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isOdd()
	{
		if (this.getValue() % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd( int value)
	{
		if ( value % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger myInt)
	{
		if (myInt.getValue() % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isPrime()
	{
		boolean bool = false;
		value = this.getValue();
		int n;
		for ( n = 2; n <= value;) 
		{
			if (value % n == 0)
			{
				bool = false;
			}
			else
			{
				bool = true;
			}
		}
		return bool;
	}
	
	public static boolean isPrime( int value)
	{
		boolean bool = false;
		int n;
		for ( n = 2; n <= value;) 
		{
			if (value % n == 0)
			{
				bool = false;
			}
			else
			{
				bool = true;
			}
			
		}
		return bool;
		}
	
	public static boolean isPrime(MyInteger myInt)
	{
		int value = myInt.getValue();
		int n;
		boolean bool = false;
		for ( n = 2; n <= value;) 
		{
			if (value % n == 0)
			{
				bool = false;
			}
			
			else
			{
				bool = true;
			}
		}
		return bool;
	}
	
	public boolean equals(int integer)
	{
		
		int value1 = integer;
		if (value1 == integer )
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}
	
	


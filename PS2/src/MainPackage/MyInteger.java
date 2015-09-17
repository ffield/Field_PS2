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
}

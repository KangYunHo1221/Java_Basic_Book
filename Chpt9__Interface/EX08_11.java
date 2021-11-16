package Chpt9__Interface;

//Interface 쓰려면 가지고 있는 메소드를 전부 구현해야함
public class EX08_11 implements EX08_10 {
	String strVal;
	int intVal;

	public String getString() 
	{
		return strVal;
	}
	public void setString(String str)
	{
		strVal = str;
	}
	
	public int getInt()
	{
		return intVal;
	}
	public void setInt(int i)
	{
		intVal = i;
	}
	public float getFloat() // no use
	{
		return (float) 0;
	}
	public void setFloat(float f)
	{
		return;
	}
}

package Chpt9__Interface;

//EX08_13이 EX08_12, EX08_12가 EX08_10를 상속했기 때문에 EX08_13은 EX08_10것까지 선언해줘야함
public class EX08_13 implements EX08_12{
	String name;
	String strVal;
	int intVal;
	float floatVal;
	
	//EX08_10 의 interface
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
	
	//EX08_12 의 인터페이스
	public void setName()
	{
		this.name = name;
	}

}

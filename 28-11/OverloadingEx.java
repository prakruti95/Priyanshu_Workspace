
public class OverloadingEx 
{
	static int cal(int a,int b)
	{
		return a+b;//9
	}
	
	static int cal(int a,int b,int c)
	{
		return a*b*c;
	}
	
	public static void main(String[] args) 
	{
		OverloadingEx o1 = new OverloadingEx();
		System.out.println(o1.cal(6,3,2));
	}
}

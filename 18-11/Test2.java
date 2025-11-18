import java.util.Scanner;

public class Test2 
{
	public static void main(String[] args)
	{
		System.out.println("Enter Your Marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if(marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
}

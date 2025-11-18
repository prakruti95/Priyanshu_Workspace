import java.util.Scanner;

public class CredentialsEx 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Email");
		String email = sc.next();
		
		System.out.println("Enter Password");
		String pass = sc.next();
		
		if(email.equals("a@gmail.com") && pass.equals("1234"))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}
}

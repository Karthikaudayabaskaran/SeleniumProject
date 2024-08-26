
public class stringoperation {

	public static void main(String[] args) {
		String s="Learn selenium with Rahul Shetty ";
		String[] SplitedString  = s.split("Rahul");
		System.out.println(SplitedString[0]);

		
		//DISPLAY ALL WORDS
		//********************
		for(String s1 :SplitedString )
		{

			System.out.println(s1);
		}

		//PRINT BY CHARCTER -FORWARD
		//**************************
		for(int i=0;i<s.length();i++)
		{

			System.out.println(s.charAt(i));
		}

		//PRINT BY CHARCTER -BACKWARD
		//**************************
		for(int i=s.length()-1;i>=0;i--)
		{

			System.out.println(s.charAt(i));
		}

	String Password ="Please use temporary password 'rahulshettyacademy' to Login";
	
		String[] Password1=Password.split("'");
		System.out.println(Password1[1]);
		
	}
	
	
	


}

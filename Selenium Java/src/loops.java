
public class loops {

	public static void main(String[] args) {
		//FOR LOOPS
		//*************
		int arr[] = {2,6,9,12,3,4};
		System.out.println(arr[0]);

		for(int i=0; i< arr.length;i++)
		{
			System.out.println("Value of Array:" +arr[i]);
		}

		String[] name = {"java","core","sel","match"};

		for(int i=0; i< name.length;i++)
		{
			System.out.println("Value of String:" +name[i]);

		}	

		//ENHANCE FOR LOOP

		for(String s :name)
		{
			System.out.println(s);
		}

		//IF-ELSE 
		//**********

		for(int i=0; i< arr.length;i++)
		{

			System.out.println("Value of Array:" +arr[i]);

			int evennum =arr[i]%2;

			if (evennum==0)
			{
				System.out.println("Even Number:" +arr[i]);
			}
			else
			{
				System.out.println("Odd Number:" +arr[i]);			
			}
		}

		//TO PRINT ONLY EVEN NUMBER
		//*******************************

		for(int i=0; i< arr.length;i++)
		{
			if (arr[i] %2 ==0)
			{
				System.out.println("Value of EvenNumbers:" +arr[i]);

			}
		}}

	}

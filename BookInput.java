
import java.util.Scanner;
import java.awt.print.*;

public  class BookInput
{
	public static void main(String[] args)
	{


		Scanner input = new Scanner(System.in);
		System.out.println("Enter book information, type \"STOP\" to stop ");
		String bookInfo = input.nextLine();
			
		System.out.println(bookInfo);
		
	}
}
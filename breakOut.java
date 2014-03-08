import java.util.Scanner;


public class breakOut{
	
	public static void main (String []args){
		String quit = " ";
		int userChoice = 0;
		do{
		userChoice = userInput();
		displayResults(userChoice);
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Y to do again");
		quit = input.nextLine();
		
		} while(quit.equals("Y"));
		
		
	}
	
	public static int userInput (){
		int num = 0;
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter A Number from 1-4");
		num = keyboard.nextInt();
		
		while(num < 1 || num > 4){
			
			System.out.println("Number Not Valid, try again");
			num = keyboard.nextInt();
			
		}
		return num;
	}
	
	public static void displayResults(int userChoice){
		
		System.out.println("You Chose: " + userChoice);		
	}
	
	
}
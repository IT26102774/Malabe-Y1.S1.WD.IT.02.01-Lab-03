import java.util.Scanner;
public class IT26102774Lab3Q1A{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double kg = input.nextDouble();
		
		double total = price*kg;
		
		System.out.println();
		System.out.println("The total amount is: "+ total);
	}
}
import java.text.DecimalFormat;

public class PerfectChange
{
	/* Given an amount, write a method that calculate the most efficient way to tender the given amount  
	 * using the following denominations: 20, 10, 5 & 1 dollar bills and .25, .10, .05, and .01 coins
	 * Example: if the given amount is 19.42
	 * Output: 
	 * ten dollar bills: 1
	 * Five dollar bills: 1
	 * One dollar bills: 4
	 * Quarters: 1
	 * Dimes: 1
	 * Nickels: 1
	 * Pennies: 2
	 */
	public static void perfectChange(double amount)
	{
		/* A double variable can provide precision up to 15 to 16 decimal points.
		 * Since we are dealing with currency we need a method to control to precision to 2 decimal points
		 * the DecimalFormat class allows up to control the precision of floating variables
		 * DecimalFormat returns value as a String!!
		 */
		DecimalFormat df = new DecimalFormat(".##");
		while (amount != 0)
		{
			if(amount >= 20.00)
			{	
				System.out.println("Twenty dollar bills: "+ (int) (amount/20));
				amount = Double.valueOf( df.format(amount%20) );;
			}
			if(amount >= 10.00)
			{
				System.out.println("Ten dollar bills: "+ (int) (amount/10));
				amount = Double.valueOf( df.format(amount%10) );;
			}
			if(amount >= 5.00)
			{
				System.out.println("Five dollar bills: "+ (int) (amount/5));
				amount = Double.valueOf( df.format(amount%5) );;
			}
			if(amount >= 1.00)
			{
				System.out.println("One dollar bills: "+ (int) (amount/1));
				amount = Double.valueOf( df.format(amount%1) );;
			}
			if(amount >= .25)
			{
				System.out.println("Quarters: "+ (int) (amount/.25));
				amount = Double.valueOf( df.format(amount%.25) );;
			}
			if(amount >= .10)
			{
				System.out.println("Dimes: "+ (int) (amount/.10));
				amount = Double.valueOf( df.format(amount%.10) );;
			}
			if(amount >= .05)
			{
				System.out.println("Nickels: "+ (int) (amount/.05));
				amount = Double.valueOf( df.format(amount%.05) );;
			}
			if(amount >= .01)
			{
				System.out.println("Pennies: "+ (int) (amount/.01));
				amount = Double.valueOf( df.format(amount%.01) );;
			}
		}
	}
	public static void main(String[] args)
	{		
	
	}//--- end of main
}
;
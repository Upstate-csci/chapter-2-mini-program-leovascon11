import java.util.Scanner;

public class Fraction
{
	public static void main(String[] args)
	{
    // declare a scanner object for input
		Scanner scan = new Scanner (System.in);
		
		double fraction;
		int fractionValue;
		int decimal;
		double value;
		
		System.out.print("Enter Numerator: ");
		int numerator = scan.nextInt();
		System.out.print("Enter Denominator: ");
                int denominator = scan.nextInt();

                fraction = (double) numerator / denominator;
                fractionValue = (int) (fraction * 10);
                decimal = fractionValue % 10;
                value = decimal * 0.1;
		
		System.out.print(value);


    // prompt for numerator and read in - use print instead of println so the user will input on the same line as the prompt
    
    // prompt for denomator and read in - use print instead of println so the user will input on the same line as the prompt
    
    // compute the answer and store in a variable of type double
    
    // ouutput the answer
    
  }
}

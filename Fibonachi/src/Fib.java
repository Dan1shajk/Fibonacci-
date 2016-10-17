
public class Fib {
	private int fzero;
	private int fone;

	/**
	 * This is the constructor for the Fib class
	 * gets the user input and puts it into the private variables fzero and fone
	 * @param f0 is the first number from user input
	 * @param f1 is the second number from user input
	 */
	public Fib(int f0, int f1) {
		fzero = f0;  //initialize the private instances with args[0] and args[1]
		fone = f1;
	}

	/**
	 * This function returns the fibbonachi number using itterative method.
	 * @param n is the nth sequence in the fibbonachi numbers
	 * @return the fibbonachi number for the given n. If n = 0 then it returns the first number, if n = 1 it returns the second number
	 * 
	 */
	public int f(int n) {
		int next = 0;
		int first = fzero;  //copy the values
		int second = fone;

		if (n >= 0) {

			if (n < 1) {   
				return first;
			}
			if (n == 1) {
				return second;
			}
			for (int i = 1; i < n; i++) {  //takes the first and second numbers to get the next number in the sequence
				next = first + second;
				first = second;
				second = next;
			}
		}
		return next;
	}
/**
 * This function uses recursion to get the nth fibbonachi number
 * @param n is the nth sequence for the fibonachi number
 * @return the next number in the sequence is returned.
 */
	public int fRec(int n) {

		int next = 0;
		if (n == 0) {
			return f0;
		} else if (n == 1) {
			return f1;
		} else {
			return (fRec(n - 1) + fRec(n - 2));  //return the next sequence using recursion
		}
	}

	public static void main(String[] args) {
		try{
			f0 = Integer.parseInt(args[0]);  //gets the inputs from the command line args
			f1 = Integer.parseInt(args[1]);
			int n = Integer.parseInt(args[2]);
			if(n <=0)  //check to see if the n value is good
			{
				throw new IllegalArgumentException(); 
			}
			Fib fib = new Fib(f0, f1);  //creates an object

			for (int i = 0; i < n; i++) {  //for loop to get the fib sequence using the itterative method
				int x = fib.f(i);         //function call for itterative method
				System.out.println(x);
			}
			System.out.println("---------------------");

			for (int i = 0; i < n; i++) {
				int f = fib.fRec(i);   //for loop to get the fib sequence using the recursive method
				System.out.println(f); //function call for recursive method
			}	
		}catch(NumberFormatException e){
			System.out.println("Invalid arguments, must be of type integers");
			}
		catch(Exception e){
			System.out.println("'N' must be greater then 0");
		}
	}
	// instance variables store F(0) and F(1):
	public static int f0;
	public static int f1;
};

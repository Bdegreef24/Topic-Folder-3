import java.util.Scanner;

/**Sort three numbers
 * 
 * @author brentdegreef
 *
 */
public class Exercise6_5 {

	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a integer: ");
	        double num1 = input.nextDouble();
	        double num2 = input.nextDouble();
	        double num3 = input.nextDouble();

	        displaySortedNumbers(num1,num2,num3);
	    }

	    public static void displaySortedNumbers( double num1, double num2, double num3) {

	        double temp;
	        if (num1 > num2) {
	            temp = num1;
	            num1 = num2;
	            num2 = temp;
	        }

	        if (num2 > num3) {
	            temp = num2;
	            num2 = num3;
	            num3 = temp;
	        }
	        if (num1 > num2) {
	            temp = num1;
	            num1 = num2;
	            num2 = temp;
	        }
	        System.out.println(num1 + " " + num2 + " " + num3);
	    }
}

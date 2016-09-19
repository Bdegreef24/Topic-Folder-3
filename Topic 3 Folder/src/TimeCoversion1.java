import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion1 {
	
	private static Scanner reader;

	public static void main(String[] args) throws ParseException {


        reader = new Scanner(System.in);

        System.out.print( "Please enter a time: " );
        String now = reader.nextLine();
       Date date = new SimpleDateFormat("HHmm").parse(now);
        SimpleDateFormat format = new SimpleDateFormat("h:mm a");
        System.out.println( format.format(date));

    }

}

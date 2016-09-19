
public class TimeConversion2 {

	 public static void main(String[] args) {
	        System.in.println("Please Enter time in Decimal Format ");
	    }

	    //Prints outs HH:MM:SS
	    public static String GetReadableTime(double finalBuildTime){

	        int hours = (int) Math.floor(finalBuildTime);
	        int remainderInSeconds = (int)(3600.0* (finalBuildTime - Math.floor(finalBuildTime)) );
	        int seconds = remainderInSeconds % 60;
	        int minutes = remainderInSeconds / 60;
	        return  String.format("%02d:%02d:%02d", hours, minutes, seconds); 
	    }
	}


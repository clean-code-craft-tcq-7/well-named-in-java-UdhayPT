package colorservice;

import model.ColorPair;

public class PrintColorCode {
	
	private static ColorPair colorPair;

	public static void printColorCodes () {
		System.out.println("Printing Color Code Format");
		System.out.println("Pair Number Major Color: <major color>, Minor Color: <minor color>");
		for(int pairnumber = 1; pairnumber <= 25; pairnumber++) {
        	colorPair = Numbermethods.GetColorFromPairNumber(pairnumber);
        	System.out.println(Integer.toString(pairnumber) + " Major Color: " + colorPair.getMajor()
        		+ ", Minor Color: " + colorPair.getMinor());
        }
	}


}

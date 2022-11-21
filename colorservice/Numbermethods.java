package colorservice;

import model.ColorPair;
import model.MajorColor;
import model.MinorColor;

public class Numbermethods {
	
	public static void testNumberToPair(int pairNumber,
	        MajorColor expectedMajor,
	        MinorColor expectedMinor)
	    {
	        ColorPair colorPair = GetColorFromPairNumber(pairNumber);
	        System.out.println("Got pair " + colorPair.ToString());
	        assert(colorPair.getMajor() == expectedMajor);
	        assert(colorPair.getMinor() == expectedMinor);
	    }
	
	static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            MajorColor.fromIndex(zeroBasedPairNumber / ColorPair.numberOfMinorColors);
        MinorColor minorColor =
            MinorColor.fromIndex(zeroBasedPairNumber % ColorPair.numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }

}

package colorservice;

import model.ColorPair;
import model.MajorColor;
import model.MinorColor;

public class Pairmethods {
	static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * ColorPair.numberOfMinorColors + minor.getIndex() + 1;
    }

    public static void testPairToNumber(
        MajorColor major,
        MinorColor minor,
        int expectedPairNumber)
    {
        int pairNumber = GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }
}

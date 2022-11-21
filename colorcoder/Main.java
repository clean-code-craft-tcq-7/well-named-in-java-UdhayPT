package colorcoder;

import colorservice.Numbermethods;
import colorservice.Pairmethods;
import model.MajorColor;
import model.MinorColor;

public class Main {    
    

    public static void main(String[] args) {
    	Numbermethods.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
    	Numbermethods.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
    	Pairmethods.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
    	Pairmethods.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}

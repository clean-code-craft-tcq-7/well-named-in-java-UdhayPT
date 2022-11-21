package model;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;
    
    	public final static String MajorColorNames[] = {
            "White", "Red", "Black", "Yellow", "Violet"
        };
    	public final static int numberOfMajorColors = MajorColorNames.length;
        public final static String MinorColorNames[] = {
            "Blue", "Orange", "Green", "Brown", "Slate"
        };
        public final static int numberOfMinorColors = MinorColorNames.length;
    
    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }
    public String ToString() {
        String colorPairStr = MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
};

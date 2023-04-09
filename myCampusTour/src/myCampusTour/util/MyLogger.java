
package myCampusTour.util;

public class MyLogger{

    public static enum DebugLevel {NONE, CONSTRUCTOR, FILE_PROCESSOR, CAFETERIA_SELECTION, GIFT_SELECTION, LECTURE_SELECTION, MAIN, VISITBUILDINGBYBUS, VISITBUILDINGONFOOT, RESULTS 
                                   };

    private static DebugLevel debugLevel;

    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
    case 9: debugLevel = DebugLevel.RESULTS; break;
    case 8: debugLevel = DebugLevel.VISITBUILDINGONFOOT; break;
    case 7: debugLevel = DebugLevel.VISITBUILDINGBYBUS;break;
    case 6: debugLevel = DebugLevel.MAIN; break;
    case 5: debugLevel = DebugLevel.LECTURE_SELECTION; break;
    case 4: debugLevel = DebugLevel.GIFT_SELECTION; break;
    case 3: debugLevel = DebugLevel.CAFETERIA_SELECTION; break;
	case 2: debugLevel = DebugLevel.CONSTRUCTOR; break;
	case 1: debugLevel = DebugLevel.FILE_PROCESSOR; break;
	default: debugLevel = DebugLevel.NONE; break;
	}
    }

    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    public static void writeMessage (String     message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    public String toString() {
	return "The debug level has been set to the following " + debugLevel;
    }
}

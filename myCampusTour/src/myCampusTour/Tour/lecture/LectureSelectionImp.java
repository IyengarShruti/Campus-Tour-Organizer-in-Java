package myCampusTour.Tour.lecture;

import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;

public class LectureSelectionImp implements LectureI {

    // Data members
    LectureEnums lEnums;
    private double cost;
    private double duration;
    private double effort;
    private double carbonFootPrint;

    /**
     * Default Constructor
     * 
     * @param valIn
     */
    public LectureSelectionImp(LectureEnums valIn) {
        MyLogger.writeMessage("In LectureSelectionImp constructor\n", DebugLevel.CONSTRUCTOR);
        lEnums = valIn;
    }

    /**
     * Selects lecture according to given choices
     */
    @Override
    public void createLecture() {
        MyLogger.writeMessage("In LectureSelectionImp class\n", DebugLevel.LECTURE_SELECTION);
        if (lEnums == LectureEnums.INCLASS_CS542) {
            CS542Class();
        }
        if (lEnums == LectureEnums.VIDEOSTREAM_CS542) {
            CS542VideoStream();
        }
    }

    /**
     * sets values if chosen enum is CS542Class
     */
    public void CS542Class() {
        double basePrice = 600.00;
        setCost(basePrice + (0.01 * basePrice));
        setDuration(30.00);
        setEffort(getDuration() * 3);
        setCarbonFootPrint(3.2);

    }

    /**
     * sets values if chosen enum is CS542VideoStream
     */
    public void CS542VideoStream() {
        setCost(800.00);
        setDuration(30.00);
        setEffort(getDuration() * 2);
        setCarbonFootPrint(4.0);

    }

    
    @Override
    public void setCost(double costIn) {
        cost = costIn;

    }


    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double getCarbonFootPrint() {
        return carbonFootPrint;
    }

    @Override
    public void setCarbonFootPrint(double carbonFootPrintIn) {
        carbonFootPrint = carbonFootPrintIn;
    }

    @Override
    public double getDuration() {
        return duration;
    }

    @Override
    public void setDuration(double durationIn) {
        duration = durationIn;
    }

    @Override
    public double getEffort() {
        return effort;
    }

    @Override
    public void setEffort(double effortIn) {
        effort = effortIn;
    }

    public String toString() {
        String data = "The activity to attend lecture " + lEnums + " and it's summary is as follows: " + "\n"
                + "Cost in Dollars:       $" + getCost() + "\n" + "Carbon Foot Print:     " + getCarbonFootPrint()
                + " Tonnes of CO2" + "\n" +
                "Efforts in calories:   " + getEffort() + " calories" + "\n" + "Duration in minutes:   " + getDuration()
                + " minutes";
        return data;
    }
}

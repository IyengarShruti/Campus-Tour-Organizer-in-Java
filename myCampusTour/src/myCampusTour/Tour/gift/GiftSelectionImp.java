package myCampusTour.Tour.gift;

import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;

public class GiftSelectionImp implements  GiftI{

    //Data members
    GiftEnums gEnums;
    private double cost;
    private double duration;
    private double effort;
    private double carbonFootPrint;


    /**
     * Default Constructor
     */
    public GiftSelectionImp(GiftEnums valIn){
        MyLogger.writeMessage("In GiftSelectionImp constructor\n", DebugLevel.CONSTRUCTOR);

        gEnums = valIn;
        
    }
    /** 
     * Selects gift according to given choices
     */
    public void createGift(){
        MyLogger.writeMessage("In GiftSelectionImp createGift\n", DebugLevel.GIFT_SELECTION); 
        if(gEnums == GiftEnums.EVENT_CENTER){
            collectFromEventCenter();
        }
        if (gEnums == GiftEnums.UNIVERSITY_UNION) {
            collectFromUniversityUnion();
        }

    }
    /**
     * sets values if chosen enum is collectFromEventCenter
     */
    private void collectFromEventCenter() {
        setCost(1.00);
        setDuration(25.20);
        setEffort(getDuration()*150.00);
        setCarbonFootPrint(0.89);

    }
    /**
     * sets values if chosen enum is collectFromUniversityUnion
     */
    private void collectFromUniversityUnion() {
        setCost(0.80);
        setDuration(15.20);
        setEffort(getDuration()*100.00);
        setCarbonFootPrint(0.78);

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
        String data = "The picking up of gift from  "+gEnums+ " and it's summary is as follows: "+"\n"+"Cost in Dollars:       $" +getCost()+"\n"+ "Carbon Foot Print:     "+ getCarbonFootPrint()+" Tonnes of CO2"+"\n"+
                "Efforts in calories:   "+ getEffort()+" calories"+"\n"+ "Duration in minutes:   "+ getDuration()+" minutes";
        return data;
    }
}






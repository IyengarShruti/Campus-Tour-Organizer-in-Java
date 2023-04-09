package myCampusTour.Tour.cafeteria;

import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;

public class CafeteriaSelectionImp implements CafeteriaI{

    //Data members
    CafeteriaEnums cEnums;
    private double cost;
    private double duration;
    private double effort;
    private double carbonFootPrint;
    /**
     * Default Constructor
     */
    public CafeteriaSelectionImp(CafeteriaEnums valIn){
        MyLogger.writeMessage("In CafeteriaSelectionImp constructor\n", DebugLevel.CONSTRUCTOR);

        cEnums = valIn;
    }
    /** 
     * Selects cafeteria according to given choices
     */
    public void createCafeteria(){
        MyLogger.writeMessage("In CafeteriaSelectionImp createCafeteria\n", DebugLevel.CAFETERIA_SELECTION); 
        if(cEnums == CafeteriaEnums.QUEUE_CIW){
            collegeInTheWoodsOrder();
        }
        if (cEnums == CafeteriaEnums.ONLINE_MV) {
            mountainViewOrder();
        }

    }
    /**
     * sets values if chosen enum is collegeInTheWoods
     */
    private void collegeInTheWoodsOrder() {
        double basePrice = 5.00;
        setCost(basePrice+(0.05*basePrice));
        setDuration(40.20);
        setEffort(getDuration()*20.00);
        setCarbonFootPrint(0.56);

    }
    /**
     * sets values if chosen enum is mountainViewOrder
     */
    private void mountainViewOrder() {
        double basePrice = 10.00;
        setCost(basePrice+(0.05*basePrice));
       setDuration(20.20);
        setEffort(getDuration()*20.00);
        setCarbonFootPrint(0.09);

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
        String data = "The visit to cafeteria "+cEnums+ " and it's summary is as follows: "+"\n"+"Cost in Dollars:       $" +getCost()+"\n"+ "Carbon Foot Print:     "+ getCarbonFootPrint()+" Tonnes of CO2"+"\n"+
                "Efforts in calories:   "+ getEffort()+" calories"+"\n"+ "Duration in minutes:   "+ getDuration()+" minutes";
        return data;
    }
}

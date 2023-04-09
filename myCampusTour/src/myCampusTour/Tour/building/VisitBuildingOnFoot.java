package myCampusTour.Tour.building;

import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;

public class VisitBuildingOnFoot implements BuildingI {

    BuildingEnums bEnums;
    private double cost;
    private double duration;
    private double effort;
    private double carbonFootPrint;

    public VisitBuildingOnFoot(BuildingEnums val) {
        MyLogger.writeMessage("In VisitBuildingOnFoot constructor\n", DebugLevel.CONSTRUCTOR);
        bEnums = val;
    }

    public void visitBuilding() {
        MyLogger.writeMessage("In VisitBuildingOnFoot class\n", DebugLevel.VISITBUILDINGONFOOT);
        if (bEnums == BuildingEnums.SOM_ONFOOT) {
            setCost(1.00);
           setDuration(45.00);
            setEffort(getDuration() * 200.00);
            setCarbonFootPrint(0.06);
        }
        if (bEnums == BuildingEnums.WATSON_ONFOOT) {
            setCost(1.00);
            setDuration(20.20);
            setEffort(getDuration() * 100.00);
            setCarbonFootPrint(40.40);
        }
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
        String data = "The visit to Building "+bEnums+ " summary is as follows: "+"\n"+"Cost in Dollars:       $" +getCost()+"\n"+ "Carbon Foot Print:     "+ getCarbonFootPrint()+" Tonnes of CO2"+"\n"+
                "Efforts in calories:   "+ getEffort()+" calories"+"\n"+ "Duration in minutes:   "+ getDuration()+" minutes";
        return data;
    }
}
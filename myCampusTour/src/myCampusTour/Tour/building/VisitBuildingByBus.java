package myCampusTour.Tour.building;
import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;

public class VisitBuildingByBus implements BuildingI{

    BuildingEnums bEnums;
    private double cost;
    private double duration;
    private double effort;
    private double carbonFootPrint;

    public VisitBuildingByBus(BuildingEnums val) {
        MyLogger.writeMessage("In VisitBuildingByBus constructor\n", DebugLevel.CONSTRUCTOR);
        bEnums = val;

    }

    public void visitBuilding() {
        MyLogger.writeMessage("In VisitBuildingByBus \n", DebugLevel.VISITBUILDINGBYBUS);
        if(bEnums == BuildingEnums.SOM_BUS){
        setCost(3.00);
        setDuration(30.0);
        setEffort(getDuration()*100.00);
        setCarbonFootPrint(0.03);
        }
        if(bEnums == BuildingEnums.WATSON_BUS){
        setCost(3.00);
        setDuration(10.00);
        setEffort(getDuration()*100.00);
        setCarbonFootPrint(20.20);
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

    public String toString(){
        String data = "The visit to Building "+bEnums+ " summary is as follows: "+"\n"+"Cost in Dollars:       $" +getCost()+"\n"+ "Carbon Foot Print:     "+ getCarbonFootPrint()+" Tonnes of CO2"+"\n"+
                "Efforts in calories:   "+ getEffort()+" calories"+"\n"+ "Duration in minutes:   "+ getDuration()+" minutes";
        return data;
}
    
}
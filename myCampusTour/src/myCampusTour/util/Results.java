package myCampusTour.util;
import java.util.ArrayList;
import java.util.List;
import myCampusTour.activityCalculation.ActivityI;
import myCampusTour.util.MyLogger.DebugLevel;


/**
 * class to populate list to display 
 * total of all activities
 */
public class Results {

double sumOfCost;
double sumOfDuration;
double sumOfEffort;
double sumOfcarbonFootPrint;
List<ActivityI> listOfActivities;

/**
 * Results constructor
 */
public Results(){
    MyLogger.writeMessage("In the constructor of Results class\n", DebugLevel.CONSTRUCTOR);
    listOfActivities = new ArrayList<>();
}

/**
 * @param activities
 */
public void calculateTotal(ActivityI activities){
    MyLogger.writeMessage("In the calculate method of Results class\n", DebugLevel.RESULTS);
    listOfActivities.add(activities);
    for(ActivityI myActivities: listOfActivities) {
        sumOfCost+= myActivities.getCost();
        sumOfDuration+=myActivities.getDuration();
        sumOfEffort+=myActivities.getEffort();
        sumOfcarbonFootPrint+=myActivities.getCarbonFootPrint();
    }

}
/**
 * Printing Total of Results
 */
public void printTotal(){

    MyLogger.writeMessage("In the printTotal method of Results class\n", DebugLevel.RESULTS);
    //precision to 2 decimal places
    String costString = String.format("%.02f", sumOfCost);
    String effortString = String.format("%.02f", sumOfEffort);
    String durationString = String.format("%.02f", sumOfDuration);
    String carbonString = String.format("%.02f", sumOfcarbonFootPrint);

    System.out.println("**************** Total summary of all tour activities ******************");
    String allActivityTotal = "Cost in Dollars:       $" +costString+"\n"+ "Carbon Foot Print:     "+ carbonString+" Tonnes of CO2"+"\n"+
    "Efforts in calories:   "+ effortString+" calories"+"\n"+ "Duration in minutes:   "+ durationString+" minutes";
    System.out.println(allActivityTotal);
}
}


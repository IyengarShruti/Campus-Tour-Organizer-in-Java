package myCampusTour.activityCalculation;

public class TonnesOfCo2Imp implements CarbonFootPrintI {

    private double carbonFootPrint;

    /**
    * default constructor
    */
    public TonnesOfCo2Imp(){
        carbonFootPrint= 0;

    }
    public void setCarbonFootPrint(double carbonFootPrintIn){
        carbonFootPrint = carbonFootPrintIn;

    }
    /** 
     * @return carbonFootPrint
     */
    @Override
    public double getCarbonFootPrint() {
        return carbonFootPrint;
    }
    public String toString() {
        return "The class to set values for carbon foot print" + getCarbonFootPrint();
    }
}
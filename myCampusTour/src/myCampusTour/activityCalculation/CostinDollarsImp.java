package myCampusTour.activityCalculation;

public class CostinDollarsImp implements CostI{
    private double cost;

    public CostinDollarsImp(){
        cost = 0.0;
    }
    /**
     * @param costIn
     */
    public void setCost(double costIn){
        cost = costIn;

    }
    /**
     * @return cost
     */
    @Override
    public double getCost() {
        return cost;
    }
    public String toString() {
        return "The class to set values for cost in dollars" + getCost();
    }
}
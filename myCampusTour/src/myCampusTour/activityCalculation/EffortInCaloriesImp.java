package myCampusTour.activityCalculation;

public class EffortInCaloriesImp implements EffortI{
    private double effort;

    /**
     * default Constructor 
     */
    public EffortInCaloriesImp(){
        effort = 0.0;
    }
    
    /**
     * @return effort
     */
    @Override
    public double getEffort() {
        return effort;
    }
    /**
     * @param effortIn
     */
    @Override
    public void setEffort(double effortIn) {
        effort = effortIn;
    }
    public String toString() {
        return "The class to set values for efforts in calories" + getEffort();
    }
}
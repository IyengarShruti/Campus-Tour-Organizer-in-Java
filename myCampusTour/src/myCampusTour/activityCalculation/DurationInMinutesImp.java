package myCampusTour.activityCalculation;

public class DurationInMinutesImp implements DurationI{
    private double duration;
    
    public DurationInMinutesImp(){
        duration = 0.0;
    }
    /**
     * @param durationIn
     */
    @Override
    public void setDuration(double durationIn) {
        duration = durationIn;
    }
    /**
     * @return duration
     */
    @Override
    public double getDuration() {
        return duration;
    }
    public String toString() {
        return "The class to set values for duration of the activity" + getDuration();
    }
    
}
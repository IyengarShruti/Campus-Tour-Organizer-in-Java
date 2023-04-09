package myCampusTour.builder;

public class BuilderWorkshop implements BuilderWorkshopI{
   
    /** 
     * Construct tour 
     */
    public void constructTour(ItenaryForTour createVisit){
        createVisit.tourBuilding();
        createVisit.tourLecture();
        createVisit.tourGift();
        createVisit.tourCafeteria();
        createVisit.tourTotalMeasure();

    }
    
}
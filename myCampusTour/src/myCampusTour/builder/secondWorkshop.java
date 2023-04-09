package myCampusTour.builder;

public class secondWorkshop implements BuilderWorkshopI{
    
    /** 
     * Construct tour 
     */
    public void constructTour(ItenaryForTour createVisit){

        createVisit.tourCafeteria();
        createVisit.tourGift();
        createVisit.tourBuilding();
        createVisit.tourLecture();
        createVisit.tourTotalMeasure2();

    }
    
}
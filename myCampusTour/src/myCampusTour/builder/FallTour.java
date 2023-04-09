package myCampusTour.builder;
import myCampusTour.Tour.building.BuildingEnums;
import myCampusTour.Tour.building.BuildingI;
import myCampusTour.Tour.building.VisitBuildingByBus;
import myCampusTour.Tour.building.VisitBuildingOnFoot;
import myCampusTour.Tour.cafeteria.CafeteriaEnums;
import myCampusTour.Tour.cafeteria.CafeteriaI;
import myCampusTour.Tour.cafeteria.CafeteriaSelectionImp;
import myCampusTour.Tour.gift.GiftEnums;
import myCampusTour.Tour.gift.GiftI;
import myCampusTour.Tour.gift.GiftSelectionImp;
import myCampusTour.Tour.lecture.LectureEnums;
import myCampusTour.Tour.lecture.LectureI;
import myCampusTour.Tour.lecture.LectureSelectionImp;
import myCampusTour.util.Results;


public class FallTour extends ItenaryForTour{

    //Data members for FallTour
    BuildingEnums build1Choice;
    BuildingEnums build2Choice;
    LectureEnums lectureChoice;
    GiftEnums giftChoice;
    CafeteriaEnums cafeteriaChoice;
    BuildingI myBuilding1;
    BuildingI myBuilding2;
    LectureI myLecture;
    GiftI myGift;
    CafeteriaI myCafeteria;
    Results res,res1;


    /**
     * Constructor for Fall Tour
     * @param build1
     * @param build2
     * @param lectureIn
     * @param giftIn
     * @param cafeteriaIn
     */
    public FallTour(BuildingEnums build1, BuildingEnums build2, LectureEnums lectureIn, GiftEnums giftIn, CafeteriaEnums cafeteriaIn){
        this.build1Choice = build1;
        this.build2Choice = build2;
        this.lectureChoice = lectureIn;
        this.giftChoice = giftIn;
        this.cafeteriaChoice = cafeteriaIn;
        res = new Results();
        res1 = new Results();

    }

    /** 
     * For visiting building
     */
    @Override
    public void tourBuilding() {
        if(build1Choice == BuildingEnums.WATSON_ONFOOT || build1Choice == BuildingEnums.SOM_ONFOOT){
            myBuilding1 = new VisitBuildingOnFoot(build1Choice);
            myBuilding1.visitBuilding();
            System.out.println(myBuilding1.toString());
            res.calculateTotal(myBuilding1);
            res1.calculateTotal(myBuilding1);


        } 
        if (build1Choice == BuildingEnums.WATSON_BUS || build1Choice == BuildingEnums.SOM_BUS) {
            myBuilding1 = new VisitBuildingByBus(build1Choice);
            myBuilding1.visitBuilding();
            System.out.println(myBuilding1.toString());
            res.calculateTotal(myBuilding1);
            res1.calculateTotal(myBuilding1);

        }
        if(build2Choice == BuildingEnums.WATSON_ONFOOT || build2Choice == BuildingEnums.SOM_ONFOOT){
            myBuilding2 = new VisitBuildingOnFoot(build2Choice);
            myBuilding2.visitBuilding();
            System.out.println(myBuilding2.toString());
            res.calculateTotal(myBuilding2);
            res1.calculateTotal(myBuilding2);


        }
        if (build2Choice == BuildingEnums.WATSON_BUS || build2Choice == BuildingEnums.SOM_BUS) {
            myBuilding2 = new VisitBuildingByBus(build2Choice);
            myBuilding2.visitBuilding();
            System.out.println(myBuilding2.toString());
            res.calculateTotal(myBuilding2);
            res1.calculateTotal(myBuilding2);
        }     
    }
    /** 
     * For attending lecture
     */
    @Override
    public void tourLecture() {
        myLecture = new LectureSelectionImp(lectureChoice);
        myLecture.createLecture();
        System.out.println(myLecture.toString());
        res.calculateTotal(myLecture);
        res1.calculateTotal(myLecture);

    }
    /** 
     * For picking up gift
     */
    @Override
    public void tourGift() {
        myGift = new GiftSelectionImp(giftChoice);
        myGift.createGift();
        System.out.println(myGift.toString());
        res.calculateTotal(myGift);
        res1.calculateTotal(myGift);
    }

    /** 
     * For visiting cafeteria 
     */
    @Override
    public void tourCafeteria() {
        myCafeteria = new CafeteriaSelectionImp(cafeteriaChoice);
        myCafeteria.createCafeteria();
        System.out.println(myCafeteria.toString());
        res.calculateTotal(myCafeteria);
        res1.calculateTotal(myCafeteria);
    }
    /** 
     * printing in Results class
    //  */
    public void tourTotalMeasure(){
        res.printTotal();

    }
    @Override
    public void tourTotalMeasure2() {
        res1.printTotal();
    }
    
}
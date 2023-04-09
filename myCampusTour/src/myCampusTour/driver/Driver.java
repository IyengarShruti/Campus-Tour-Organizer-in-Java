package myCampusTour.driver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import myCampusTour.Tour.building.BuildingEnums;
import myCampusTour.Tour.cafeteria.CafeteriaEnums;
import myCampusTour.Tour.gift.GiftEnums;
import myCampusTour.Tour.lecture.LectureEnums;
import myCampusTour.builder.BuilderWorkshop;
import myCampusTour.builder.BuilderWorkshopI;
import myCampusTour.builder.FallTour;
import myCampusTour.builder.ItenaryForTour;
import myCampusTour.builder.secondWorkshop;
import myCampusTour.util.LogError;
import myCampusTour.util.MyLogger;

public class Driver {
	public static void main(String[] args) throws IOException {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */
		List<String> errorList = new ArrayList<>();
		LogError logObject;
		LogError logObject1;
		
	    if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {

			String error = "Error: Incorrect number of arguments. Program accepts 5 arguments.";
			errorList.add(error.toString());
			logObject1 =new LogError(args[0]);
			logObject1.writeErrorsToConsole(errorList);
			logObject1.writeToErrorFile(errorList);
			MyLogger.writeMessage(error, MyLogger.DebugLevel.MAIN);
			System.exit(0);
		}
		
		int debug_Level=0;
		String errorLog = args[0];
		logObject = new LogError(errorLog);
		try{
		debug_Level = Integer.parseInt(args[1]);
		}catch(NumberFormatException e){

		/**
		 * Error logging for wrong format of 
		 * the command line argument
		 */
			String error ="Invalid format entered";
			errorList.add(error.toString());
			logObject.writeErrorsToConsole(errorList);
			logObject.writeToErrorFile(errorList);
			System.exit(1);
		}
		MyLogger.setDebugValue(debug_Level);

		
			
		System.out.println("**************Welcome to the fall 2022 tour****************");
		ItenaryForTour createTour = new FallTour(BuildingEnums.WATSON_BUS,BuildingEnums.SOM_ONFOOT, LectureEnums.INCLASS_CS542, GiftEnums.UNIVERSITY_UNION, CafeteriaEnums.QUEUE_CIW);
        BuilderWorkshopI workshopTour = new BuilderWorkshop();
        workshopTour.constructTour(createTour);
		System.out.println(" ");
		System.out.println("**************Welcome to the fall 2022 tour****************");
		ItenaryForTour secondTour = new FallTour(BuildingEnums.SOM_BUS,BuildingEnums.WATSON_ONFOOT, LectureEnums.VIDEOSTREAM_CS542, GiftEnums.EVENT_CENTER, CafeteriaEnums.ONLINE_MV);
        BuilderWorkshopI secondWorkshopTour = new secondWorkshop();
        secondWorkshopTour.constructTour(secondTour);
		

		}
		
	
	}



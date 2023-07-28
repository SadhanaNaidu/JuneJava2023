package AssignmentQuestions;
import java.time.*; //time package imports LocalDate(),LocalTime(),LocalDateTime(),LocalTimeFormatter() classes
//import java.util.date;
import java.time.format.DateTimeFormatter; // import DateTimeFormatter class under time.format package

public class AQ9DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate LD = LocalDate.now(); // method now() under LocalDate class returns current date
		LocalTime LT = LocalTime.now(); // method now() under LocalTime class returns current time
		LocalDateTime LDT = LocalDateTime.now(); //returns default formatted date and time
		
		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/dd/MM"); //object DTF is created under class 'DateTimeFormatter' 
																			//using 'ofPattern' method to format or parse 
		
		String FDT = LDT.format(DTF);
		
		System.out.println("Today's Date: "+LD);
		System.out.println("Today's Time: "+LT);
		System.out.println("\nDate and Time before formatting: "+LDT);
		System.out.println("Date After formatting: "+FDT);
		
		
	}//Incomplete

}

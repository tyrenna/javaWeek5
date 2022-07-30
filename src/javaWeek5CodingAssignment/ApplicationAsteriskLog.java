package javaWeek5CodingAssignment;

public class ApplicationAsteriskLog {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		Logger logger1 = new SpacedLogger();
		
		logger.log("Hello");
		logger.error("Hello");
		
		logger1.log("Hello");
		logger1.error("Hello");
		
		
		
	}

}

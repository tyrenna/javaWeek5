package javaWeek5CodingAssignment;

public class AsteriskLogger implements Logger { // Step 3a Create two classes AsteriskLogger

	// Step 4 and 5
	@Override
	public void log(String log) {
		
		//System.out.println("***"+log+"***"); One Way to return
		//Or sys out build message
		
		System.out.println(buildmessage(log));
	}

	//build a message as both outputs we want have similarities
	
	private String buildmessage(String log) {
		return "***"+log+"***";
    }
	
	
	@Override
	public void error(String error) {
 		String starerror = buildmessage(error);
 		String stars = "*".repeat(starerror.length());
 		
 		System.out.println(" ");
 		
 		System.out.println(stars);
 		System.out.println(starerror);
 		System.out.println(stars);
	}

}

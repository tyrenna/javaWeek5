package javaWeek5CodingAssignment;

public class SpacedLogger implements Logger { // Step 3b Create two classes SpacedLogger

	// Step 6 through 8
	@Override
	public void log(String log) {
		System.out.println(" ");
		System.out.println(buildmessage(log));
		System.out.println(" ");
	}

	
	private String buildmessage(String log) {
		StringBuilder b = new StringBuilder();
		
		
		for(int i = 0; i < log.length(); i++) {
			char ch = log.charAt(i);
			b.append(ch).append(" ");
		}
	
		b.setLength(b.length() - 1);
	return b.toString();
	
	}
	
	@Override
	public void error(String error) {
	System.out.println("ERROR: "+buildmessage(error));

	}

}

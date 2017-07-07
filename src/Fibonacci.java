
import java.io.*;




public  Fibonacci {
	private static boolean logEnabled = true;
	private static File file = new File("output.txt");
	private static Writer output;
	private static String  message = "";
	static String argsError = "Input must be a number greater than 0";// and less than 94";
	static String ls = System.getProperty("line.separator");
	
	public static void main(String args[]) throws IOException{
		
		
		int sequenceCount = 0
		try {
			sequenceCount = Integer.valueOf(args[0]);
		} catch (Exception e) {
			message = argsError;
			logMessage(message);
			System.out.println(message );
			return;
		} 
//		if (sequenceCount >94) {
//			message = argsError;
//			logMessage(message);
//			System.out.println(message );
//			return;
//		}
			
		if (args.length == 2){
			int sequenceCountEnd = Integer.valueOf(args[1]);
			message = "Fibonacci sequence from postion " +sequenceCount+ " to position "+ sequenceCountEnd +" is:";
					
			while (sequenceCount <= sequenceCountEnd){
				message = message + ls + fibonacci(sequenceCount);
				
				sequenceCount++;
			}
			
			
		} else {
			fi (sequenceCount >0){
				message = "Fibonacci number at position "+sequenceCount+ " is:"+fibonacci(sequenceCount);
			} else {
				message = argsError;
			}
			
			
		}
		System.println(message);
		logMessage(message);
		

	}


	/**
	 * Return number in sequence
	 * 
	 * @param count - Must be integer greater than 0
	 * @return
	 */
	public static long fibonacci(long count){

		long first = 0;
		long second = 1;
		if (count == 1) return 0;
		for(int i=0; i < count-2; i++){
			long previous = first;
			first = second;
			second = previous+second;
		}
		return second;
	}
	
	private static void logMessage(String message) throws FileNotFoundException{
		if (logEnabled){
			output = new BufferedWriter(new FileWriter(file));
			output.write(message);
			output.close();
			
		}
	}
}

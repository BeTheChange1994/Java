
public class UsingExceptions {

	public static void main(String[] args) {
		
		try {
			throwException();
		}
		catch(Exception exception){
			
			System.err.println("Exception  handled in main");
		}

		doesNotThrowException();
	}
	
	public static void throwException() throws Exception{
		
		try {
			System.out.println("Method throwException");
			throw new Exception();
		}
		catch(Exception exception) {
		
		System.err.println("Exception handled in method throwException");
		throw exception;
		}
		finally {
			
			System.err.println("Finally executed in throwException");
		}
	}

	public static void doesNotThrowException() {
		
		try {
			System.out.println("Mehtod doesNotThrowException");
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
		finally {
			System.err.println("Finally excepted in doesNotThrowException");
		}
		
		System.out.println("End of methoddeosNotThrowException");
	}
}

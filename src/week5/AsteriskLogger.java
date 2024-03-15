package week5;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***"+ log + "***");
		
		System.out.println();
	}

	@Override
	public void error(String error) {
		for(int i = 0; i < error.length()+13; i++)
		{
			System.out.print("*");	
		}
		System.out.println(); 
		System.out.println("***Error: "+ error + "***");
		System.out.println("****************"); 
		System.out.println();
	}

	

	

}

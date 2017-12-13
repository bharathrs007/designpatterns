package InterpretorPattern;

public class interpretordemo {
	
	
	
	
	public static void main(String args[]) {
		
		System.out.println("Converting $100 to EUR");
		double amt=100;
		double convertedamt=0;
		currencyconvertor cc=new currencyconvertor();	
		String converttocurr="EUR";
		
		convertor c=null;
		
		if(converttocurr.equalsIgnoreCase("INR")) {
			
			c=new usdtoinr(amt);
			convertedamt=c.convert(cc);
			System.out.println("The converted amount in INR is: "+convertedamt);
			
		} else {
			
			c=new usdtoeur(amt);
			convertedamt=c.convert(cc);
			System.out.println("The converted amount in EUR is: "+convertedamt);
			
		}
		
		
	}
	
	
	
	

}

package StrategyPattern;

public class Strategydemo {
	
	public static void main(String args[]) {
		
		iauthenticate ia=null;
		String authtype="forms";
		
		if(authtype.equalsIgnoreCase("forms")) {
			ia=new formsauth("user1","*******");
		}else if(authtype.equalsIgnoreCase("Google")) {
			ia=new googleauthentication("user1","axr4550313djrldoepcvjrmvrortjvlr");
		}
		
		if(ia.authenticateuser()) {
			System.out.println("Authentication successful");
		}
		
	}

}

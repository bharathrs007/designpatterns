package StrategyPattern;

public class googleauthentication implements iauthenticate {

	
	String user;
	String token;
	
	public googleauthentication(String usr,String tkn) {
		this.user=usr;
		this.token=tkn;
	}
	
	public String getauthdetails(String user) {
		//get the token from google
		return "axr4550313djrldoepcvjrmvrortjvlr";
	}

	@Override
	public boolean authenticateuser() {
		String temptkn=getauthdetails(this.user);
		if(this.token==temptkn) {
			return true;
		}
		return false;
	}

}

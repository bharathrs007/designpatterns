package StrategyPattern;

public class formsauth implements iauthenticate{

	String user;
	String password;
	
	public formsauth(String usr, String pwd) {
		this.user=usr;
		this.password=pwd;
	}
	
	@Override
	public boolean authenticateuser() {
		String pwd=getauthdetails(this.user);
		if(pwd==this.password) {
			return true;
		}
		else {
			return false;
		}
		
	}

	
	public String getauthdetails(String user) {
		
		return "*******";
		
	}

}

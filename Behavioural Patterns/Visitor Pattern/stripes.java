package VisitorPattern;

public class stripes implements customizable{
	
	String stripestyle;
	
	public stripes(String stripestyle) {
		this.stripestyle=stripestyle;
	}

	@Override
	public void addtocar(customizer c) {
		
		c.addcomponent(this);
		
	}
	
	

}

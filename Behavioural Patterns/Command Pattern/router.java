package CommandPattern;

public class router {
	
	String typeofcar=null;
	order o=null;
	
	
	
	public void createcar(String type) {
		if(type.equalsIgnoreCase("Hatchback")) {
			o=new hatchback();
		}else if(type.equalsIgnoreCase("Sedan")) {
			o=new sedan();
		}
		
		o.execute();
	}
	
}

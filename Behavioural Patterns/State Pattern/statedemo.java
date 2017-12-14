package StatePattern;

public class statedemo {
	
	public static void main(String args[]) {
		eventstate es;
		windshieldcontext ws=new windshieldcontext();
		String states="Rain";
		if(states.equalsIgnoreCase("Rain")) {
			es=new rain();
			ws.setcontext(es);
		}
		else if(states.equalsIgnoreCase("Day")) {
			es=new day();
			ws.setcontext(es);
		}
		
		ws.performaction();
		
	}

}

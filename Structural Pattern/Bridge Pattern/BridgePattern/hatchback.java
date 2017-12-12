package BridgePattern;

public class hatchback extends vehicle {

	public hatchback(type type1, type type2) {
		super(type1, type2);
	}
	
	
	

	@Override
	public void manufacture() {
		System.out.println("Started Manufacturing a hatchback");
		type1.manufacture();
		type2.manufacture();
		
	}

}

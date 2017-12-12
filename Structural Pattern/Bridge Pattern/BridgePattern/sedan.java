package BridgePattern;

public class sedan extends vehicle {

	public sedan(type type1, type type2) {
		super(type1, type2);
	}

	@Override
	public void manufacture() {
		System.out.println("Started Manufacturing a sedan");
		type1.manufacture();
		type2.manufacture();		
	}

}

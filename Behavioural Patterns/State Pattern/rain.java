package StatePattern;

public class rain implements eventstate {

	@Override
	public void performaction() {
		
		System.out.println("Wiper will be turned on");
		
	}

}

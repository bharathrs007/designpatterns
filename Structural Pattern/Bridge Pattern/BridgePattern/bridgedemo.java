package BridgePattern;

public class bridgedemo {

	public static void main(String[] args) {
		
	vehicle v1=new hatchback(new design(),new production());
	v1.manufacture();
	

	}

}

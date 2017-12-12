package BridgePattern;

public abstract class vehicle {
	
	public type type1;
	public type type2;
	
	public vehicle(type type1, type type2) {
		this.type1=type1;
		this.type2=type2;
	}
	
	public abstract void manufacture();

}

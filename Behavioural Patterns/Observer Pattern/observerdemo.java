package ObserverPattern;

public class observerdemo {
	
	public static void main(String args[]) {
		
		obsrvvalue o=new obsrvvalue(10);
		observerobject oo= new observerobject(o);
		o.addObserver(oo);
		o.setnewval(10);
	}

}
